package pl.project13.jo.scala.listener

import pl.project13.jo.antlr._
import pl.project13.jo.antlr.GoLangParser._
import pl.project13.jo.scala.clazz._
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
    val jvmReturnType = parseJvmType(ctx.returnType)

    println("func name: [%s], return type: [%s]".format(funcName, jvmReturnType))

    joc.defFunc(funcName, jvmReturnType)
  }


  override def enterStatement(ctx: StatementContext) {
    if (ctx.RETURN() != null) {
      println("Handling return statement...")
      CORE.handleReturn(tokens.getText(ctx.returnArguments))
    } else if (ctx.packagePrefix != null) {
      tokens.getText(ctx.packagePrefix) match {
        case "fmt"    => FMT.handleMethod(tokens.getText(ctx.funcName), tokens.getText(ctx.funcArguments))
        case other    => throw new RuntimeException(s"Only supporting fmt for now, tried to call [$other]!") // TODO implement me (obviously handle somehow else)
      }
    }
  }

  override def exitFuncDeclaration(ctx: FuncDeclarationContext) {
    println("exit func")

    joc.exitFunc()
  }

  override def exitSourceFile(ctx: SourceFileContext) {
    joc.close()

    val file = new File("/tmp", generatedClassName + ".class")
    file.delete()
    file.createNewFile()
    Files.write(joc.getByteCode, file)
    println("class stored in: [%s] ".format(file.getAbsolutePath))
  }

  /** Get the bytes of the generate `class`. */
  def getGeneratedClazzDesc: GoClassDesc = new GoClassDesc(generatedClassName, joc.getByteCode)

  // private

  private def tokens = parser.getTokenStream

  // todo maybe this can be done in the parser right away?
  private def parseJvmType(returnType: ReturnTypeContext): JvmType =
    if (returnType == null) {
      VoidType
    } else {
      tokens.getText(returnType) match {
        case "int"    => IntType
        case "string" => ObjectType(classOf[String])
        case other    => throw new RuntimeException(s"Not yet supported type [$other]!") // TODO implement me
      }
    }

  // mocks todo remove those
  object FMT {
    def handleMethod(name: String, args: Seq[Any]) {
      joc.callFunc("fmt", name, args: _*)
    }
  }

  object CORE {
    def handleReturn(vals: Seq[Any]) {
      joc.returnFromFunc(vals)
    }
  }
  // mocks todo remove those
}
