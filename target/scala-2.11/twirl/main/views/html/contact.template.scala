
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object contact_Scope0 {
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

class contact extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[User,List[Event],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User,events: List[Event]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""
"""),_display_(/*2.2*/main(title = "Contact Page", user,events)/*2.43*/ {_display_(Seq[Any](format.raw/*2.45*/("""

"""),format.raw/*4.1*/("""<h1>Home page</h1>
<p>Hello from Contact Page</p>
""")))}))
      }
    }
  }

  def render(user:User,events:List[Event]): play.twirl.api.HtmlFormat.Appendable = apply(user,events)

  def f:((User,List[Event]) => play.twirl.api.HtmlFormat.Appendable) = (user,events) => apply(user,events)

  def ref: this.type = this

}


}

/**/
object contact extends contact_Scope0.contact
              /*
                  -- GENERATED --
                  DATE: Mon Nov 19 03:25:43 EET 2018
                  SOURCE: /home/myapos/Desktop/myProjects/EventManager/app/views/contact.scala.html
                  HASH: 0077455f73f9c5431e105fda040eefb70b0fac09
                  MATRIX: 759->1|886->33|913->35|962->76|1001->78|1029->80
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4
                  -- GENERATED --
              */
          