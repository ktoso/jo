package pl.project13.jo.scala.clazz

import org.objectweb.asm._
import org.objectweb.asm.Opcodes._

class GoLangClassWriter extends GeneratedClassSettings {

  val cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES)

  var mv: MethodVisitor = _
  var fv: FieldVisitor = _

  /** @return generated classname containing this package (file) */
  def defPackage(pack: String): String = {
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
    mv.visitLocalVariable("this", "Lpl/project13/jo/helloworld;", null, l0, l2, 0)
    mv.visitMaxs(1, 1)

    fullName
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

  def defFunc(name: String) {
    name.head match {
      case l if l.isUpper => defFunc(AccPublic, name)
      case _              => defFunc(AccPrivate, name)
    }
  }

  private def defFunc(access: Int, name: String) {
    mv = cw.visitMethod(ACC_PUBLIC, name, "()V", null, null)
    mv.visitCode()
  }

  def exitFunc() {
    mv.visitMaxs(2, 1)
    mv.visitEnd()
  }

  def close() {
    cw.visitEnd()
  }

  def getByteCode: Array[Byte] = cw.toByteArray
}
