package httpSetup

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object HttpSetup {
  val httpProtocol = http
    .baseURL("https://www.google.com")
    .contentTypeHeader("application/json")
}