package query

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object HomePageQuery {

  val gethomepage = http("HomePageQury")
    .get("/home")
      .header("token", "${token}")
        .check(status.is(200),substring("You are allowed to proceed"))
}
