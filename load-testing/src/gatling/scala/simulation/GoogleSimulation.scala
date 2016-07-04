package simulation

import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.http.Predef._

import scala.concurrent.duration._

class GoogleSimulation extends Simulation {
  val baseUrl = "https://www.google.com"

  val httpProtocol = http
    .baseURL(baseUrl)
    .inferHtmlResources()
    .acceptEncodingHeader("gzip,deflate")
    .contentTypeHeader("application/json")
    .userAgentHeader("Apache-HttpClient/4.1.1 (java 1.5)")

  val s = scenario("Google Simulation")
    .exec(http("Google")
      .get("")
      .check(status.is(200)))

  setUp(s.inject(constantUsersPerSec(1) during (1 second))).protocols(httpProtocol)
}