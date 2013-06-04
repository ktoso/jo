Jo - The JVM based Go implementation
=====================================

**This is a pet project.**

And it should be spelled as "Joe", that is - similiar to "Go" the original language we're reimplementing here.

<img src="http://golang.org/doc/gopher/gopherbw.png" height="200"/>

See the official language page and docs here: <a href="http://golang.org">golang.org</a>

Does this even work?
====================
Somewhat, but it'll get better in time.

For now we're able to support Println and returning a `string` from a `func`... ;-)

Examples
--------
Go code using Jo is aimed to be used both, dynamically as you can see here:

```scala
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
  info("Jo func [GetHello] returned: " + result) // Hello, 世界

  result should equal (text)
}
```

as well as to compile into a fat-jar. But that's pretty much light years away... ;-)


Disclaimer
==========
This is a pet project in order for me to have fun generating bytecode and parsers - I'm fully aware of why/how/when the JVM vs. Go's runtime offer pretty different things.
