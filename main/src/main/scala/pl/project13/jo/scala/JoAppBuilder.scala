package pl.project13.jo.scala

import pl.project13.jo.antlr.{GoLangParser, GoLangLexer}
import org.antlr.v4.runtime._

class JoAppBuilder {

  def fromString(source: String): Runnable = {
    val stream = new ANTLRInputStream(source)
    val lexer = new GoLangLexer(stream)
    val tokens = new CommonTokenStream(lexer)
    val parser = new GoLangParser(tokens)

    // parse
    // generate code

    new Runnable {
      def run = {
        throw new RuntimeException("Not implemented yet!") // TODO implement me
      }
    }
  }
}
