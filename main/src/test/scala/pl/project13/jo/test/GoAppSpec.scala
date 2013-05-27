package pl.project13.jo.test

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec

abstract class GoAppSpec extends FlatSpec with ShouldMatchers {

  def App: String

}
