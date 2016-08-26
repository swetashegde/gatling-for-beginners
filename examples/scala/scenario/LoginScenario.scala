package scenario

import query._
import io.gatling.core.Predef._

object LoginScenario {
val loginScenario = scenario("Login")
         .exec(LoginQuery.dologin)
          .pause(5)
       .exec(HomePageQuery.gethomepage)
        .pause(5)

}
