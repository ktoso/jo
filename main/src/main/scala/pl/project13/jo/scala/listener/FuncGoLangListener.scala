package pl.project13.jo.scala.listener

import pl.project13.jo.antlr.GoLangBaseListener
import pl.project13.jo.antlr.GoLangParser._
import pl.project13.jo.scala.clazz.{GoClassDesc, GoLangClassWriter}
import java.io.File
import com.google.common.io.Files

class FuncGoLangListener(joc: GoLangClassWriter) extends GoLangBaseListener {

  var generatedClassName: String = _

  override def enterPackageDeclaration(ctx: PackageDeclarationContext) {
    val name = ctx.getStart
    println("Entered package [%s]...".format(name))
    generatedClassName = "helloworld"

    joc.defPackage("helloworld")
  }

  override def enterFuncDeclaration(ctx: FuncDeclarationContext) {
    println("translate [%s] to [%s]".format(ctx.getText, "println(hello)"))

    joc.defFunc("Main")
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
    Files.write(joc.getClassBytes, file)
    println("class stored in: [%s] ".format(file.getAbsolutePath))
  }

  /** Get the bytes of the generate `class`. */
  def getGeneratedClazzDesc: GoClassDesc = new GoClassDesc(generatedClassName, joc.getClassBytes)
}
