package pl.project13.jo.scala.clazz

import org.objectweb.asm._
import org.objectweb.asm.Opcodes._

class GoLangClassWriter extends GeneratedClassSettings {

  var pack: String = _

  val cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES)

  var mv: MethodVisitor = _
  var fv: FieldVisitor = _

  /** @return generated classname containing this package (file) */
  def defPackage(pack: String): String = {
    this.pack = pack
    val className = pack
    val fullName = JoBasePackage + "/" + className

    cw.visit(SourceLevel, AccPublic, fullName, null, JavaLangObject, Array())

    // default constructor
    mv = cw.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
    mv.visitCode()
    val l0 = new Label()
    mv.visitLabel(l0)
    mv.visitLineNumber(4, l0)
    mv.visitVarInsn(ALOAD, 0)
    mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V")
    val l1 = new Label()
    mv.visitLabel(l1)
    mv.visitLineNumber(5, l1)
    mv.visitInsn(RETURN)
    val l2 = new Label()
    mv.visitLabel(l2)
    mv.visitLocalVariable("this", "Lpl/project13/jo/" + pack + ";", null, l0, l2, 0)
    mv.visitMaxs(1, 1)

    fullName
  }

  /** handle return statements */
  def returnFromFunc(vals: Any*) {
    val s = vals.head.toString
    println("Handling simple return, one value: " + s) // todo remove and make multi return possible

    // todo very naive still - can only return a string literal
    val l0 = new Label
    mv.visitLabel(l0)
    mv.visitLineNumber(10, l0) // todo random number here...
    mv.visitLdcInsn(s.substring(1, s.length-1)) // todo only handling one value for now
    mv.visitInsn(ARETURN)
    val l1 = new Label
    mv.visitLabel(l1)
    mv.visitLocalVariable("this", "Lpl/project13/jo/" + pack + ";", null, l0, l1, 0)
  }

  /** should be called between `defFunc` and `exitFunc` */
  def callFunc(pkg: String, name: String, params: Any*) {
    // todo still only prints things

    val l0 = new Label()
    mv.visitLabel(l0)
    mv.visitLineNumber(8, l0)
    mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;")
    mv.visitLdcInsn(params.head.toString) // todo change, for now putting only
    mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V")

    val l1 = new Label()
    mv.visitLabel(l1)
    mv.visitLineNumber(9, l1)
    mv.visitInsn(RETURN)

    val l2 = new Label()
    mv.visitLabel(l2)
    mv.visitLocalVariable("this", "Lpl/project13/jo/helloworld;", null, l0, l2, 0)
  }

  def defFunc(name: String, returnType: JvmType) {
    name.head match {
      case l if l.isUpper => defFunc(AccPublic, name, returnType)
      case _              => defFunc(AccPrivate, name, returnType)
    }
  }

  private def defFunc(access: Int, name: String, returnType: JvmType) {
    mv = cw.visitMethod(ACC_PUBLIC, name, "()" + returnType.signature, null, null) // todo thats jus methods with no parameters
    mv.visitCode()
  }

  def exitFunc() {
    mv.visitMaxs(1, 1) // any number is ok here, we're using Writer in auto-calc mode, the numbers will be ignored
    mv.visitEnd()
  }

  def close() {
    cw.visitEnd()
  }

  def getByteCode: Array[Byte] = cw.toByteArray
}
