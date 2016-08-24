package simulations

import _root_.scenario._
import httpSetup._
import io.gatling.core.Predef._

class GoogleSearchSimulation extends Simulation {
 val httpConf = HttpSetup.httpProtocol
  val scn = GoogleHomeScenario.googleScenario

  setUp(scn.inject(atOnceUsers(50))
    .protocols(httpConf)).assertions(forAll.failedRequests.count.is(0))
}