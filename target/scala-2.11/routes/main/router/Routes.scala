
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/WebCA/conf/routes
// @DATE:Sun Nov 20 01:39:34 GMT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:17
  CountController_3: controllers.CountController,
  // @LINE:19
  AsyncController_2: controllers.AsyncController,
  // @LINE:22
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:17
    CountController_3: controllers.CountController,
    // @LINE:19
    AsyncController_2: controllers.AsyncController,
    // @LINE:22
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, CountController_3, AsyncController_2, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, CountController_3, AsyncController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.HomeController.about"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contact""", """controllers.HomeController.contact"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signin""", """controllers.HomeController.signin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.HomeController.signup"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """prod""", """controllers.HomeController.prod"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart""", """controllers.HomeController.cart"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account""", """controllers.HomeController.account"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkout""", """controllers.HomeController.checkout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """public/base.css""", """controllers.Assets.at(path:String = "/public", base:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_about1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_HomeController_about1_invoker = createInvoker(
    HomeController_0.about,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "about",
      Nil,
      "GET",
      """""",
      this.prefix + """about"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_contact2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contact")))
  )
  private[this] lazy val controllers_HomeController_contact2_invoker = createInvoker(
    HomeController_0.contact,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "contact",
      Nil,
      "GET",
      """""",
      this.prefix + """contact"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_signin3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signin")))
  )
  private[this] lazy val controllers_HomeController_signin3_invoker = createInvoker(
    HomeController_0.signin,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signin",
      Nil,
      "GET",
      """""",
      this.prefix + """signin"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_signup4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_HomeController_signup4_invoker = createInvoker(
    HomeController_0.signup,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signup",
      Nil,
      "GET",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_prod5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("prod")))
  )
  private[this] lazy val controllers_HomeController_prod5_invoker = createInvoker(
    HomeController_0.prod,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "prod",
      Nil,
      "GET",
      """""",
      this.prefix + """prod"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_cart6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart")))
  )
  private[this] lazy val controllers_HomeController_cart6_invoker = createInvoker(
    HomeController_0.cart,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "cart",
      Nil,
      "GET",
      """""",
      this.prefix + """cart"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_account7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account")))
  )
  private[this] lazy val controllers_HomeController_account7_invoker = createInvoker(
    HomeController_0.account,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "account",
      Nil,
      "GET",
      """""",
      this.prefix + """account"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_checkout8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkout")))
  )
  private[this] lazy val controllers_HomeController_checkout8_invoker = createInvoker(
    HomeController_0.checkout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "checkout",
      Nil,
      "GET",
      """""",
      this.prefix + """checkout"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_CountController_count9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count9_invoker = createInvoker(
    CountController_3.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_AsyncController_message10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message10_invoker = createInvoker(
    AsyncController_2.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Assets_versioned11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned11_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Assets_at12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("public/base.css")))
  )
  private[this] lazy val controllers_Assets_at12_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """public/base.css"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:7
    case controllers_HomeController_about1_route(params) =>
      call { 
        controllers_HomeController_about1_invoker.call(HomeController_0.about)
      }
  
    // @LINE:8
    case controllers_HomeController_contact2_route(params) =>
      call { 
        controllers_HomeController_contact2_invoker.call(HomeController_0.contact)
      }
  
    // @LINE:9
    case controllers_HomeController_signin3_route(params) =>
      call { 
        controllers_HomeController_signin3_invoker.call(HomeController_0.signin)
      }
  
    // @LINE:10
    case controllers_HomeController_signup4_route(params) =>
      call { 
        controllers_HomeController_signup4_invoker.call(HomeController_0.signup)
      }
  
    // @LINE:11
    case controllers_HomeController_prod5_route(params) =>
      call { 
        controllers_HomeController_prod5_invoker.call(HomeController_0.prod)
      }
  
    // @LINE:12
    case controllers_HomeController_cart6_route(params) =>
      call { 
        controllers_HomeController_cart6_invoker.call(HomeController_0.cart)
      }
  
    // @LINE:13
    case controllers_HomeController_account7_route(params) =>
      call { 
        controllers_HomeController_account7_invoker.call(HomeController_0.account)
      }
  
    // @LINE:14
    case controllers_HomeController_checkout8_route(params) =>
      call { 
        controllers_HomeController_checkout8_invoker.call(HomeController_0.checkout)
      }
  
    // @LINE:17
    case controllers_CountController_count9_route(params) =>
      call { 
        controllers_CountController_count9_invoker.call(CountController_3.count)
      }
  
    // @LINE:19
    case controllers_AsyncController_message10_route(params) =>
      call { 
        controllers_AsyncController_message10_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:22
    case controllers_Assets_versioned11_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned11_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:24
    case controllers_Assets_at12_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromQuery[String]("base", None)) { (path, base) =>
        controllers_Assets_at12_invoker.call(Assets_1.at(path, base))
      }
  }
}
