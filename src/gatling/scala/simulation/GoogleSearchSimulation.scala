package simulation

import _root_.scenario.GoogleHomeScenario
import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import protocol.HttpProtocol

import scala.concurrent.duration._

class GoogleSearchSimulation extends Simulation {
  val httpProtocol = HttpProtocol.httpProtocol
  val googleScenario = GoogleHomeScenario.googleScenario

  setUp(googleScenario.inject(constantUsersPerSec(1).during(1.second)))
    .protocols(httpProtocol)
    .assertions(forAll.failedRequests.count.is(0))
}