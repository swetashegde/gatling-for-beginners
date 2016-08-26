package httpSetup

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object HttpSetup {
  val httpProtocol = http
    .baseURL("http://localhost:5555")
    .contentTypeHeader("application/json")
}