package protocol

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object HttpProtocol {
  val httpProtocol = http
    .baseURL("https://www.google.com")
    .contentTypeHeader("application/json")
}