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
    app.run()

    // then, should have printed!
  }

}
