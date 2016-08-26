//package query
//
//import io.gatling.core.Predef._
//import io.gatling.core.session._
//import io.gatling.http.Predef._
//
//import scala.annotation.meta.param
//
//object LoginWithCsv {
//   val feedusername = csv("users.csv")
//
//  val loginWithCsv=http("LoginWithCsv")
//    .post("/login")
//      .basicAuth("username", "${username}", "password","${password}")
//    .check(status.is(200),header("token").saveAs("token"))
//}
