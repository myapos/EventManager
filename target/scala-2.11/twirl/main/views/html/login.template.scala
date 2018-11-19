
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[Application.Login],User,List[Event],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[Application.Login], user: User, events: List[Event]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.66*/("""
"""),_display_(/*2.2*/main(title = "Login Page", user, events)/*2.42*/ {_display_(Seq[Any](format.raw/*2.44*/("""
"""),format.raw/*3.1*/("""<div class="my-form-container">
"""),_display_(/*4.2*/helper/*4.8*/.form(routes.Application.authenticate, 'role -> "form", 'id -> "login-form")/*4.84*/ {_display_(Seq[Any](format.raw/*4.86*/("""
   """),format.raw/*5.4*/("""<h1>Please sign in</h1>
  <!--<input type="email" name="email" placeholder="Email" value=""""),_display_(/*6.68*/form("email")/*6.81*/.value),format.raw/*6.87*/("""">-->
      <div class="form-group">
    		<label for="username">Username:</label>
      	<input type="text" class="form-control" name="username" id="username" placeholder="username">
      </div>
   	<div class="form-group">
    		<label for="password">Password:</label>
      	<input type="password" class="form-control" name="password" id="password" placeholder="Password">
      </div>
      <button type="submit" class="btn btn-default">Login</button>
 
   """),_display_(/*17.5*/if(form.hasGlobalErrors)/*17.29*/ {_display_(Seq[Any](format.raw/*17.31*/("""
    """),format.raw/*18.5*/("""<p class="error">
        """),_display_(/*19.10*/form/*19.14*/.globalError.message),format.raw/*19.34*/("""
    """),format.raw/*20.5*/("""</p>
	""")))}),format.raw/*21.3*/("""
	"""),_display_(/*22.3*/if(flash.contains("success"))/*22.32*/ {_display_(Seq[Any](format.raw/*22.34*/("""
    """),format.raw/*23.5*/("""<p class="success">
        """),_display_(/*24.10*/flash/*24.15*/.get("success")),format.raw/*24.30*/("""
    """),format.raw/*25.5*/("""</p>
	""")))}),format.raw/*26.3*/("""
""")))}),format.raw/*27.2*/("""</div>
""")))}),format.raw/*28.2*/("""


"""))
      }
    }
  }

  def render(form:Form[Application.Login],user:User,events:List[Event]): play.twirl.api.HtmlFormat.Appendable = apply(form,user,events)

  def f:((Form[Application.Login],User,List[Event]) => play.twirl.api.HtmlFormat.Appendable) = (form,user,events) => apply(form,user,events)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Mon Nov 19 03:25:43 EET 2018
                  SOURCE: /home/myapos/Desktop/myProjects/EventManager/app/views/login.scala.html
                  HASH: db1a54b48275c747f644ed5782e0746d1967a66e
                  MATRIX: 779->1|938->65|965->67|1013->107|1052->109|1079->110|1137->143|1150->149|1234->225|1273->227|1303->231|1420->322|1441->335|1467->341|1956->804|1989->828|2029->830|2061->835|2115->862|2128->866|2169->886|2201->891|2238->898|2267->901|2305->930|2345->932|2377->937|2433->966|2447->971|2483->986|2515->991|2552->998|2584->1000|2622->1008
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|35->4|35->4|35->4|35->4|36->5|37->6|37->6|37->6|48->17|48->17|48->17|49->18|50->19|50->19|50->19|51->20|52->21|53->22|53->22|53->22|54->23|55->24|55->24|55->24|56->25|57->26|58->27|59->28
                  -- GENERATED --
              */
          