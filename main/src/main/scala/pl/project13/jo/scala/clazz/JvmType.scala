package pl.project13.jo.scala.clazz

/*
char C
byte B
short S
long J
double D
Object Ljava/lang/Object;
int[] [I
Object[][] [[Ljava/lang/Object;
 */
sealed trait JvmType {
  def signature: String
  override def toString = signature
}

object VoidType extends JvmType {
  val signature: String = "V"
}

object IntType extends JvmType {
  val signature: String = "I"
}

object FloatType extends JvmType {
  val signature: String = "F"
}

object BooleanType extends JvmType {
  val signature: String = "Z"
}

case class ObjectType(clazz: Class[_]) extends JvmType {
  val signature: String = "L%s;".format(clazz.getCanonicalName.replaceAll("\\.", "/"))
}

