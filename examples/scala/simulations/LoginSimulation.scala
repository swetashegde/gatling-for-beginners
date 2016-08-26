package simulations


import _root_.scenario._
import httpSetup._
import io.gatling.core.Predef._

class LoginSimulation extends Simulation {
  val httpSetup = HttpSetup.httpProtocol
  val scn = LoginScenario.loginScenario

  setUp(scn.inject(atOnceUsers(5)))
    .protocols(httpSetup).assertions(forAll.failedRequests.count.is(0))

}
