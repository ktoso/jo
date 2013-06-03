package pl.project13.jo.scala

import pl.project13.jo.antlr.{GoLangParser, GoLangLexer}
import org.antlr.v4.runtime._
import pl.project13.jo.scala.listener.FuncGoLangListener
import pl.project13.jo.scala.clazz.GoLangClassWriter
import pl.project13.jo.clazz.SimpleGoClassLoader
import org.antlr.v4.runtime.tree.ParseTreeWalker
import pl.project13.jo.api.JoPackage
import pl.project13.jo.scala.api.JoPackageImpl

class GoFileParser {

  private val goClassLoader = new SimpleGoClassLoader

  def parse(source: String): JoPackage = {

    println("-------------------------------")
    println(source)
    println("-------------------------------")

    val stream = new ANTLRInputStream(source)
    val lexer = new GoLangLexer(stream)
    val tokens = new CommonTokenStream(lexer)

    val parser = new GoLangParser(tokens)
    val listener = new FuncGoLangListener(parser, new GoLangClassWriter)

    parser.setBuildParseTree(true)

    val sourceFileTree = parser.sourceFile() // parse!

    val walker = new ParseTreeWalker
    walker.walk(listener, sourceFileTree)

    val desc = listener.getGeneratedClazzDesc
    val helloWorldClazz = goClassLoader.defineClass(desc.fullName, desc.bytes)

    new JoPackageImpl(helloWorldClazz)
  }
}
