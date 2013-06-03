package pl.project13.jo.scala

import pl.project13.jo.antlr.{GoLangParser, GoLangLexer}
import org.antlr.v4.runtime._
import pl.project13.jo.scala.listener.FuncGoLangListener
import pl.project13.jo.scala.clazz.GoLangClassWriter
import pl.project13.jo.clazz.SimpleGoClassLoader

class JoAppBuilder {

  private val goClassLoader = new SimpleGoClassLoader

  def makeNewListener() = new FuncGoLangListener(new GoLangClassWriter)

  def runnableFrom(source: String): Runnable = {
    val goLangListener = makeNewListener()

    val stream = new ANTLRInputStream(source)
    val lexer = new GoLangLexer(stream)
    val tokens = new CommonTokenStream(lexer)
    val parser = new GoLangParser(tokens)
    parser.setBuildParseTree(true)
    parser.addParseListener(goLangListener)

    // trigger parsing
    val sourceFile = parser.sourceFile()

    val desc = goLangListener.getGeneratedClazzDesc
    val helloWorldClazz = goClassLoader.defineClass(desc.fullName, desc.bytes)

    new Runnable {
      def run() {
        println("==== Running Go Code! ===")

        println("new instance: ")
        val helloGo = helloWorldClazz.newInstance()
        println("has funcs: ")
        helloWorldClazz.getDeclaredMethods foreach { f => println("declared: " + f.getName) }
        println("calling Main: ")

        val Main = helloWorldClazz.getDeclaredMethod("Main")
        Main.invoke(helloGo)
      }
    }
  }
}
