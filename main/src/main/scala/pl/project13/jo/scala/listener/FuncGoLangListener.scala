package pl.project13.jo.scala.listener

import pl.project13.jo.antlr._
import pl.project13.jo.antlr.GoLangParser._
import pl.project13.jo.scala.clazz.{GoClassDesc, GoLangClassWriter}
import java.io.File
import com.google.common.io.Files

class FuncGoLangListener(parser: GoLangParser, joc: GoLangClassWriter) extends GoLangBaseListener {

  var generatedClassName: String = _

  override def enterPackageDeclaration(ctx: PackageDeclarationContext) {
    val name = ctx.getStart
    println("Entered package [%s]...".format(name))
    generatedClassName = "helloworld"

    joc.defPackage("helloworld")
  }

  override def enterFuncDeclaration(ctx: FuncDeclarationContext) {
    val funcName = tokens.getText(ctx.funcName)
    println("method name: [%s]".format(funcName))

    joc.defFunc(funcName)
  }


  override def enterStatement(ctx: StatementContext) {
    tokens.getText(ctx.packagePrefix) match {
      case "fmt" => FMT.handleMethod(tokens.getText(ctx.funcName), tokens.getText(ctx.funcArguments))
      case _     => throw new RuntimeException("Only supporting fmt for now!") // TODO implement me (obviously handle somehow else)
    }

  }

  override def exitFuncDeclaration(ctx: FuncDeclarationContext) {
    println("exit func")

    joc.exitFunc()
  }

  override def exitSourceFile(ctx: SourceFileContext) {
    joc.close()

    val file = new File("/tmp", "helloworld.class")
    file.delete()
    file.createNewFile()
    Files.write(joc.getByteCode, file)
    println("class stored in: [%s] ".format(file.getAbsolutePath))
  }

  /** Get the bytes of the generate `class`. */
  def getGeneratedClazzDesc: GoClassDesc = new GoClassDesc(generatedClassName, joc.getByteCode)

  // private

  private def tokens = parser.getTokenStream

  // mocks todo remove those
  object FMT {
    def handleMethod(name: String, args: Any*) {
      joc.callFunc("fmt", name, args: _*)
    }
  }
  // mocks todo remove those
}
