
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object services_Scope0 {
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

class services extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[Location],String,String,List[Event],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(locations: List[Location], username: String, role:String,events: List[Event]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.80*/("""
"""),_display_(/*2.2*/main(title = "Services Page" , null, events)/*2.46*/ {_display_(Seq[Any](format.raw/*2.48*/("""

"""),format.raw/*4.1*/("""<h1>Services page</h1>
<p>Hello from Services Page</p>
"""),_display_(/*6.2*/for(location <- locations) yield /*6.28*/{_display_(Seq[Any](format.raw/*6.29*/("""
    """),_display_(/*7.6*/location/*7.14*/.id),format.raw/*7.17*/(""" """),format.raw/*7.18*/("""<br>
    """),_display_(/*8.6*/location/*8.14*/.name),format.raw/*8.19*/(""" """),format.raw/*8.20*/("""<br>
    """),_display_(/*9.6*/location/*9.14*/.address),format.raw/*9.22*/(""" """),format.raw/*9.23*/("""<br>
    """),_display_(/*10.6*/location/*10.14*/.latitude),format.raw/*10.23*/(""" """),format.raw/*10.24*/("""<br>
    """),_display_(/*11.6*/location/*11.14*/.longitude),format.raw/*11.24*/(""" """),format.raw/*11.25*/("""<br>
    
""")))}),format.raw/*13.2*/("""
"""),format.raw/*14.1*/("""<div class="form-group">
<label for="location">Location:</label>
<select class="form-control" class="form-control" name="location" id="location" placeholder="location">
"""),_display_(/*17.2*/for(location <- locations) yield /*17.28*/{_display_(Seq[Any](format.raw/*17.29*/("""
 """),format.raw/*18.2*/("""<option value="""),_display_(/*18.17*/location/*18.25*/.id),format.raw/*18.28*/(""">"""),_display_(/*18.30*/location/*18.38*/.id),format.raw/*18.41*/(""" """),_display_(/*18.43*/location/*18.51*/.name),format.raw/*18.56*/("""  """),_display_(/*18.59*/location/*18.67*/.address),format.raw/*18.75*/(""" """),_display_(/*18.77*/location/*18.85*/.latitude),format.raw/*18.94*/(""" """),_display_(/*18.96*/location/*18.104*/.longitude),format.raw/*18.114*/("""</option>   
    
""")))}),format.raw/*20.2*/("""
"""),format.raw/*21.1*/("""</select> 
 </div>
 
      <div class="form-group">
    		<label for="location">Location:</label>
 				<select class="form-control" class="form-control" name="location" id="location" placeholder="location">
    				<option>1</option>
    				<option>2</option>
    				<option>3</option>
    				<option>4</option>
  				</select>
      	<!--<input type="text" class="form-control" name="location" id="location" placeholder="location">-->
      </div>
""")))}))
      }
    }
  }

  def render(locations:List[Location],username:String,role:String,events:List[Event]): play.twirl.api.HtmlFormat.Appendable = apply(locations,username,role,events)

  def f:((List[Location],String,String,List[Event]) => play.twirl.api.HtmlFormat.Appendable) = (locations,username,role,events) => apply(locations,username,role,events)

  def ref: this.type = this

}


}

/**/
object services extends services_Scope0.services
              /*
                  -- GENERATED --
                  DATE: Mon Nov 19 03:25:42 EET 2018
                  SOURCE: /home/myapos/Desktop/myProjects/EventManager/app/views/services.scala.html
                  HASH: e7865b8a1e804ecc92a12dbeab5c900772d6abce
                  MATRIX: 785->1|958->79|985->81|1037->125|1076->127|1104->129|1185->185|1226->211|1264->212|1295->218|1311->226|1334->229|1362->230|1397->240|1413->248|1438->253|1466->254|1501->264|1517->272|1545->280|1573->281|1609->291|1626->299|1656->308|1685->309|1721->319|1738->327|1769->337|1798->338|1839->349|1867->350|2063->520|2105->546|2144->547|2173->549|2215->564|2232->572|2256->575|2285->577|2302->585|2326->588|2355->590|2372->598|2398->603|2428->606|2445->614|2474->622|2503->624|2520->632|2550->641|2579->643|2597->651|2629->661|2678->680|2706->681
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|37->6|37->6|37->6|38->7|38->7|38->7|38->7|39->8|39->8|39->8|39->8|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|44->13|45->14|48->17|48->17|48->17|49->18|49->18|49->18|49->18|49->18|49->18|49->18|49->18|49->18|49->18|49->18|49->18|49->18|49->18|49->18|49->18|49->18|49->18|49->18|51->20|52->21
                  -- GENERATED --
              */
          