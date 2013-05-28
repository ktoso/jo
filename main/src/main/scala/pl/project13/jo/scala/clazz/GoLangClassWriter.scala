package pl.project13.jo.scala.clazz

import org.objectweb.asm._
import org.objectweb.asm.Opcodes._

class GoLangClassWriter extends GeneratedClassSettings {

  val cw = new ClassWriter(0)

  var mv: MethodVisitor = _
  var fv: FieldVisitor = _

  /** @return generated classname containing this package (file) */
  def defPackage(pack: String): String = {
    val className = pack
    val fullName = JoBasePackage + "/" + className

    cw.visit(SourceLevel, AccPublic, fullName, null, JavaLangObject, Array())

    // default constructor
    mv = cw.visitMethod(AccPublic, "<init>", "()V", null, null)
    mv.visitVarInsn(ALOAD, 0)
    mv.visitMethodInsn(INVOKESPECIAL, JavaLangObject, "<init>", "()V")

    fullName
  }


  def defFunc(name: String) {
    name.head match {
      case l if l.isUpper => defFunc(AccPublic, name)
      case _              => defFunc(AccPrivate, name)
    }
  }

  def defFunc(access: Int, name: String) {
//    mv = cw.visitMethod(access, name, "()V", null, null)

    // todo remove me, hardcoded hello world
    mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null)
    mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;")
    mv.visitLdcInsn("hello")
    mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V")
    mv.visitInsn(RETURN)
    mv.visitMaxs(2, 1)
    // todo remove me, hardcoded hello world

  }

  def exitFunc() {
    mv.visitEnd()
  }

  def close() {
    cw.visitEnd()
  }

  def getClassBytes: Array[Byte] = cw.toByteArray
}
