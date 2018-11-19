
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/myapos/Desktop/myProjects/EventManager/conf/routes
// @DATE:Mon Nov 19 03:25:42 EET 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  Application_1: controllers.Application,
  // @LINE:40
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    Application_1: controllers.Application,
    // @LINE:40
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """myName/$name<[^/]+>""", """controllers.Application.myName(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """services""", """controllers.Application.services()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contact""", """controllers.Application.contact()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.Application.register()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """links""", """controllers.Application.links()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.login()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.authenticate()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.Application.registerUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.Application.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin""", """controllers.Application.admin()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """location""", """controllers.Application.registerLocation()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """event""", """controllers.Application.registerEvent()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_myName1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("myName/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_myName1_invoker = createInvoker(
    Application_1.myName(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "myName",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """myName/$name<[^/]+>"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Application_services2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("services")))
  )
  private[this] lazy val controllers_Application_services2_invoker = createInvoker(
    Application_1.services(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "services",
      Nil,
      "GET",
      """""",
      this.prefix + """services"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Application_contact3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contact")))
  )
  private[this] lazy val controllers_Application_contact3_invoker = createInvoker(
    Application_1.contact(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "contact",
      Nil,
      "GET",
      """""",
      this.prefix + """contact"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Application_register4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_Application_register4_invoker = createInvoker(
    Application_1.register(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "register",
      Nil,
      "GET",
      """""",
      this.prefix + """register"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Application_links5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("links")))
  )
  private[this] lazy val controllers_Application_links5_invoker = createInvoker(
    Application_1.links(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "links",
      Nil,
      "GET",
      """""",
      this.prefix + """links"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Application_login6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_login6_invoker = createInvoker(
    Application_1.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Application_authenticate7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_authenticate7_invoker = createInvoker(
    Application_1.authenticate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "authenticate",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Application_registerUser8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_Application_registerUser8_invoker = createInvoker(
    Application_1.registerUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "registerUser",
      Nil,
      "POST",
      """""",
      this.prefix + """register"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Application_logout9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Application_logout9_invoker = createInvoker(
    Application_1.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Application_admin10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin")))
  )
  private[this] lazy val controllers_Application_admin10_invoker = createInvoker(
    Application_1.admin(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "admin",
      Nil,
      "GET",
      """""",
      this.prefix + """admin"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_Application_registerLocation11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("location")))
  )
  private[this] lazy val controllers_Application_registerLocation11_invoker = createInvoker(
    Application_1.registerLocation(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "registerLocation",
      Nil,
      "POST",
      """""",
      this.prefix + """location"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_Application_registerEvent12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("event")))
  )
  private[this] lazy val controllers_Application_registerEvent12_invoker = createInvoker(
    Application_1.registerEvent(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "registerEvent",
      Nil,
      "POST",
      """""",
      this.prefix + """event"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_Assets_at13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at13_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index())
      }
  
    // @LINE:11
    case controllers_Application_myName1_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_Application_myName1_invoker.call(Application_1.myName(name))
      }
  
    // @LINE:13
    case controllers_Application_services2_route(params) =>
      call { 
        controllers_Application_services2_invoker.call(Application_1.services())
      }
  
    // @LINE:15
    case controllers_Application_contact3_route(params) =>
      call { 
        controllers_Application_contact3_invoker.call(Application_1.contact())
      }
  
    // @LINE:17
    case controllers_Application_register4_route(params) =>
      call { 
        controllers_Application_register4_invoker.call(Application_1.register())
      }
  
    // @LINE:19
    case controllers_Application_links5_route(params) =>
      call { 
        controllers_Application_links5_invoker.call(Application_1.links())
      }
  
    // @LINE:21
    case controllers_Application_login6_route(params) =>
      call { 
        controllers_Application_login6_invoker.call(Application_1.login())
      }
  
    // @LINE:23
    case controllers_Application_authenticate7_route(params) =>
      call { 
        controllers_Application_authenticate7_invoker.call(Application_1.authenticate())
      }
  
    // @LINE:26
    case controllers_Application_registerUser8_route(params) =>
      call { 
        controllers_Application_registerUser8_invoker.call(Application_1.registerUser())
      }
  
    // @LINE:28
    case controllers_Application_logout9_route(params) =>
      call { 
        controllers_Application_logout9_invoker.call(Application_1.logout())
      }
  
    // @LINE:30
    case controllers_Application_admin10_route(params) =>
      call { 
        controllers_Application_admin10_invoker.call(Application_1.admin())
      }
  
    // @LINE:32
    case controllers_Application_registerLocation11_route(params) =>
      call { 
        controllers_Application_registerLocation11_invoker.call(Application_1.registerLocation())
      }
  
    // @LINE:34
    case controllers_Application_registerEvent12_route(params) =>
      call { 
        controllers_Application_registerEvent12_invoker.call(Application_1.registerEvent())
      }
  
    // @LINE:40
    case controllers_Assets_at13_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at13_invoker.call(Assets_0.at(path, file))
      }
  }
}