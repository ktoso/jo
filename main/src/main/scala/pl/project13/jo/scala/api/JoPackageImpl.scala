package pl.project13.jo.scala.api

import pl.project13.jo.api.JoPackage

class JoPackageImpl(jvmClass: Class[_]) extends JoPackage {

  var currentInstance = jvmClass.newInstance()

  def isRunnable: Boolean =
    jvmClass.getDeclaredMethods.map(_.getName) contains "Main"

  def asRunnable(): Runnable = {
    if (isRunnable) {
      new Runnable {
        def run() {
          println("==== Running Go Code! ===")

          val Main = jvmClass.getDeclaredMethod("Main")
          Main.invoke(currentInstance)
        }
      }
    } else {
      throw new ClassCastException("The jo package [%s] has no Main func, unable to act like it's runnable!")
    }
  }

  def callUnsafe[T](name: String, forResult: Class[T]): T = {
    val Func = jvmClass.getDeclaredMethod(name)
    Func.invoke(currentInstance).asInstanceOf[T]
  }
}
