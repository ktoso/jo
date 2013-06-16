package pl.project13.jo.grammargen

import java.net.URI

class SpecFetcher {

  /**
   * Gets all EBNF classed lines
   * @return
   */
  def get(from: String): List[String] = {
    val html = io.Source.fromURI(new URI(from)).toString()

  }
}
