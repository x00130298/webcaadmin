
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/webcaadmin/conf/routes
// @DATE:Fri Dec 09 13:09:29 GMT 2016

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
  HomeController_1: controllers.HomeController,
  // @LINE:19
  LoginController_4: controllers.LoginController,
  // @LINE:23
  CountController_0: controllers.CountController,
  // @LINE:25
  AsyncController_2: controllers.AsyncController,
  // @LINE:28
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:19
    LoginController_4: controllers.LoginController,
    // @LINE:23
    CountController_0: controllers.CountController,
    // @LINE:25
    AsyncController_2: controllers.AsyncController,
    // @LINE:28
    Assets_3: controllers.Assets
  ) = this(errorHandler, HomeController_1, LoginController_4, CountController_0, AsyncController_2, Assets_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, LoginController_4, CountController_0, AsyncController_2, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.HomeController.about"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contact""", """controllers.HomeController.contact"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.HomeController.signup"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """prod""", """controllers.HomeController.prod"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart""", """controllers.HomeController.cart"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account""", """controllers.HomeController.account"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkout""", """controllers.HomeController.checkout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProduct""", """controllers.HomeController.addProduct"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
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
    HomeController_1.index,
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
    HomeController_1.about,
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
    HomeController_1.contact,
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
  private[this] lazy val controllers_HomeController_signup3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_HomeController_signup3_invoker = createInvoker(
    HomeController_1.signup,
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

  // @LINE:10
  private[this] lazy val controllers_HomeController_prod4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("prod")))
  )
  private[this] lazy val controllers_HomeController_prod4_invoker = createInvoker(
    HomeController_1.prod,
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

  // @LINE:11
  private[this] lazy val controllers_HomeController_cart5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart")))
  )
  private[this] lazy val controllers_HomeController_cart5_invoker = createInvoker(
    HomeController_1.cart,
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

  // @LINE:12
  private[this] lazy val controllers_HomeController_account6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account")))
  )
  private[this] lazy val controllers_HomeController_account6_invoker = createInvoker(
    HomeController_1.account,
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

  // @LINE:13
  private[this] lazy val controllers_HomeController_checkout7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkout")))
  )
  private[this] lazy val controllers_HomeController_checkout7_invoker = createInvoker(
    HomeController_1.checkout,
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

  // @LINE:14
  private[this] lazy val controllers_HomeController_addProduct8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProduct")))
  )
  private[this] lazy val controllers_HomeController_addProduct8_invoker = createInvoker(
    HomeController_1.addProduct,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addProduct",
      Nil,
      "GET",
      """""",
      this.prefix + """addProduct"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_LoginController_login9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login9_invoker = createInvoker(
    LoginController_4.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      """loginRoutes""",
      this.prefix + """login"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_LoginController_loginSubmit10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit10_invoker = createInvoker(
    LoginController_4.loginSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """loginSubmit"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_CountController_count11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count11_invoker = createInvoker(
    CountController_0.count,
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

  // @LINE:25
  private[this] lazy val controllers_AsyncController_message12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message12_invoker = createInvoker(
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

  // @LINE:28
  private[this] lazy val controllers_Assets_versioned13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned13_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
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

  // @LINE:30
  private[this] lazy val controllers_Assets_at14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("public/base.css")))
  )
  private[this] lazy val controllers_Assets_at14_invoker = createInvoker(
    Assets_3.at(fakeValue[String], fakeValue[String]),
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
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:7
    case controllers_HomeController_about1_route(params) =>
      call { 
        controllers_HomeController_about1_invoker.call(HomeController_1.about)
      }
  
    // @LINE:8
    case controllers_HomeController_contact2_route(params) =>
      call { 
        controllers_HomeController_contact2_invoker.call(HomeController_1.contact)
      }
  
    // @LINE:9
    case controllers_HomeController_signup3_route(params) =>
      call { 
        controllers_HomeController_signup3_invoker.call(HomeController_1.signup)
      }
  
    // @LINE:10
    case controllers_HomeController_prod4_route(params) =>
      call { 
        controllers_HomeController_prod4_invoker.call(HomeController_1.prod)
      }
  
    // @LINE:11
    case controllers_HomeController_cart5_route(params) =>
      call { 
        controllers_HomeController_cart5_invoker.call(HomeController_1.cart)
      }
  
    // @LINE:12
    case controllers_HomeController_account6_route(params) =>
      call { 
        controllers_HomeController_account6_invoker.call(HomeController_1.account)
      }
  
    // @LINE:13
    case controllers_HomeController_checkout7_route(params) =>
      call { 
        controllers_HomeController_checkout7_invoker.call(HomeController_1.checkout)
      }
  
    // @LINE:14
    case controllers_HomeController_addProduct8_route(params) =>
      call { 
        controllers_HomeController_addProduct8_invoker.call(HomeController_1.addProduct)
      }
  
    // @LINE:19
    case controllers_LoginController_login9_route(params) =>
      call { 
        controllers_LoginController_login9_invoker.call(LoginController_4.login)
      }
  
    // @LINE:20
    case controllers_LoginController_loginSubmit10_route(params) =>
      call { 
        controllers_LoginController_loginSubmit10_invoker.call(LoginController_4.loginSubmit)
      }
  
    // @LINE:23
    case controllers_CountController_count11_route(params) =>
      call { 
        controllers_CountController_count11_invoker.call(CountController_0.count)
      }
  
    // @LINE:25
    case controllers_AsyncController_message12_route(params) =>
      call { 
        controllers_AsyncController_message12_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:28
    case controllers_Assets_versioned13_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned13_invoker.call(Assets_3.versioned(path, file))
      }
  
    // @LINE:30
    case controllers_Assets_at14_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromQuery[String]("base", None)) { (path, base) =>
        controllers_Assets_at14_invoker.call(Assets_3.at(path, base))
      }
  }
}
