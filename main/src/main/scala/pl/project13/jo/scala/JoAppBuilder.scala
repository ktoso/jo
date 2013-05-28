package pl.project13.jo.scala

import pl.project13.jo.antlr.{GoLangParser, GoLangLexer}
import org.antlr.v4.runtime._
import pl.project13.jo.scala.listener.FuncGoLangListener
import pl.project13.jo.scala.clazz.GoLangClassWriter
import pl.project13.jo.clazz.SimpleGoClassLoader

class JoAppBuilder {

  def makeNewListener() = new FuncGoLangListener(new GoLangClassWriter)

  def fromString(source: String): Runnable = {
    val goLangListener = makeNewListener()

    val stream = new ANTLRInputStream(source)
    val lexer = new GoLangLexer(stream)
    val tokens = new CommonTokenStream(lexer)
    val parser = new GoLangParser(tokens)
    parser.setBuildParseTree(true)
    parser.addParseListener(goLangListener)
    val sourceFile = parser.sourceFile()

    val desc = goLangListener.getGeneratedClazzDesc
    val helloWorldClazz = SimpleGoClassLoader.loadClass(desc.fullName, desc.bytes)


    new Runnable {
      def run() {
        println("==== Running Go Code! ===")

        val helloGo = helloWorldClazz.newInstance()
        val Main = helloWorldClazz.getDeclaredMethod("Main", helloWorldClazz)
        Main.invoke(helloGo)
      }
    }
  }
}
