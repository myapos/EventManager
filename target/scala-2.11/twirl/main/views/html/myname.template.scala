
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object myname_Scope0 {
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

class myname extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,User,List[Event],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String, user: User,events: List[Event]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.48*/("""
"""),_display_(/*2.2*/main(title = "myName", user, events)/*2.38*/ {_display_(Seq[Any](format.raw/*2.40*/("""

"""),format.raw/*4.1*/("""<h1>myName page</h1>
<p>Hello """),_display_(/*5.11*/name),format.raw/*5.15*/("""</p>
""")))}))
      }
    }
  }

  def render(name:String,user:User,events:List[Event]): play.twirl.api.HtmlFormat.Appendable = apply(name,user,events)

  def f:((String,User,List[Event]) => play.twirl.api.HtmlFormat.Appendable) = (name,user,events) => apply(name,user,events)

  def ref: this.type = this

}


}

/**/
object myname extends myname_Scope0.myname
              /*
                  -- GENERATED --
                  DATE: Mon Nov 19 03:25:43 EET 2018
                  SOURCE: /home/myapos/Desktop/myProjects/EventManager/app/views/myname.scala.html
                  HASH: ed9f52d2d0fa14a88404714dd566d3b92ac8a644
                  MATRIX: 764->1|905->47|932->49|976->85|1015->87|1043->89|1100->120|1124->124
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|36->5|36->5
                  -- GENERATED --
              */
          