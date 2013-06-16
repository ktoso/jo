package pl.project13.scala.oculus.actor

import pl.project13.jo.test.GoAppSpec
import pl.project13.jo.api.JoApp

class HelloIfTest extends GoAppSpec {

  behavior of "hello world source"

  def App = io.Source.fromInputStream(getClass.getClassLoader.getResourceAsStream("go/apps/helloif.go")).getLines().mkString("\n")

  it should "should return false if condition was false" in {
    // given
    val app = JoApp.fromString(App.replaceAll("TEST_VALUE", "false"))

    // when
    app.callUnsafe("TestIf", classOf[Boolean])

    // then, should have printed!
    fail("Really test this! With a hook on sysout.")
  }

  it should "should return true if condition was true" in {
    // given
    val app = JoApp.fromString(App.replaceAll("TEST_VALUE", "true"))

    // when
    val got = app.callUnsafe("TestIf", classOf[Boolean])

    // then, should have printed!
    fail("Really test this! With a hook on sysout.")
  }

}
