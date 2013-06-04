package pl.project13.scala.oculus.actor

import pl.project13.jo.test.GoAppSpec
import pl.project13.jo.api.JoApp

class HelloWorldTest extends GoAppSpec {

  behavior of "hello world source"

  def App = io.Source.fromInputStream(getClass.getClassLoader.getResourceAsStream("go/apps/helloworld.go")).getLines().mkString("\n")

  it should "should print 'Hello, 世界'" in {
    // given
    val app = JoApp.fromString(App)

    // when
    app.asRunnable().run()

    // then, should have printed!
    fail("Really test this! With a hook on sysout.")
  }

  it should "return a string from a func" in {
    // given
    val text = "Hello, 世界"
    val source =
      s"""package helloworld2
         |
         |func GetHello() string {
         |    return "$text"
         |}
      """.stripMargin

    // when
    val app = JoApp.fromString(source)
    val result = app.callUnsafe("GetHello", classOf[String])

    // then
    info("Jo func [GetHello] returned: " + result)
    result should equal (text)
  }

}
