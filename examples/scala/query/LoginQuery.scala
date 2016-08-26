package query

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object LoginQuery {

 val dologin = http("Login")
    .post("/login")
      .queryParam("username","user1")
       .queryParam("password","password123")
       .check(status.is(200),header("token").is("1234abcd").saveAs("token"))

}
