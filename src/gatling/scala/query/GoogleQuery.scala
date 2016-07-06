package query

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object GoogleQuery {
  val query = http("Google")
    .get("")
    .check(status.is(200))
}