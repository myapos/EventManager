
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object links_Scope0 {
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

class links extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[User,List[Event],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User,events: List[Event]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""
"""),_display_(/*2.2*/main(title = "Links", user, events)/*2.37*/ {_display_(Seq[Any](format.raw/*2.39*/("""

"""),format.raw/*4.1*/("""<h1>Useful Links</h1>
    <div class="list-group">
      <a href="https://www.playframework.com/" class="list-group-item" target="_blank">
          <span class="glyphicon glyphicon-education"></span> Play Framework Official Website
      </a>
      <a href="http://www.waitingforcode.com/play-framework" class="list-group-item" target="_blank">
          <span class="glyphicon glyphicon-education"></span> Play Framework Tutorial
      </a>
      <a href="https://www.playframework.com/documentation/2.1.1/JavaGuide4k" class="list-group-item" target="_blank">
          <span class="glyphicon glyphicon-education"></span> Adding authentication - Play Framework Official Website
      </a>
    </div>
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
object links extends links_Scope0.links
              /*
                  -- GENERATED --
                  DATE: Mon Nov 19 03:25:42 EET 2018
                  SOURCE: /home/myapos/Desktop/myProjects/EventManager/app/views/links.scala.html
                  HASH: c7d839c5d7fa9a2c5a15e291271f31c507ac3268
                  MATRIX: 755->1|882->33|909->35|952->70|991->72|1019->74
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4
                  -- GENERATED --
              */
          