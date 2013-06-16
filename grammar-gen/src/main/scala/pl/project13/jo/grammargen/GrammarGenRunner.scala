package pl.project13.jo.grammargen

/**
 * Fetches the GoLang spec from it's website (in EBNF format),
 * and returns both files - the EBNF spec as well as the generated ANTLR4 gramar.
 */
object GrammarGenRunner extends App {

  val fetcher = new SpecFetcher

  val html = fetcher.get("http://golang.org/ref/spec")
}
