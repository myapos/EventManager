
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object admin_Scope0 {
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

class admin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[Form[Application.RegisterLocation],Form[Application.RegisterEvent],List[Location],String,String,User,List[Event],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form1: Form[Application.RegisterLocation],form2: Form[Application.RegisterEvent],locations: List[Location], username: String, role:String,user: User,events: List[Event]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.172*/("""
"""),_display_(/*2.2*/main(title = "Admin Area" , user, events)/*2.43*/ {_display_(Seq[Any](format.raw/*2.45*/("""

"""),format.raw/*4.1*/("""<div class="row"> 
	<div class="col-xs-4 welcome-msg"> </div>
	<div class="col-xs-4 welcome-msg"> </div>
	<div class="col-xs-4 welcome-msg">  
      """),_display_(/*8.8*/role/*8.12*/ match/*8.18*/ {/*9.4*/case "user" =>/*9.18*/ {_display_(Seq[Any](format.raw/*9.20*/("""
 		   """),format.raw/*10.7*/("""Welcome, """),_display_(/*10.17*/username),format.raw/*10.25*/(""". Currently you are logged in as """),_display_(/*10.59*/role),format.raw/*10.63*/(""". <a href=""""),_display_(/*10.75*/routes/*10.81*/.Application.logout()),format.raw/*10.102*/("""">Logout</a>
  		""")))}/*12.5*/case "admin" =>/*12.20*/ {_display_(Seq[Any](format.raw/*12.22*/("""
  		  """),format.raw/*13.7*/("""<p>Welcome, """),_display_(/*13.20*/username),format.raw/*13.28*/(""". Currently you are logged in as """),_display_(/*13.62*/role),format.raw/*13.66*/(""". <br>
  		  If you want to logout click here:   <a href=""""),_display_(/*14.53*/routes/*14.59*/.Application.logout()),format.raw/*14.80*/("""">Logout</a> <br>
  		  If you want to upload an event click here: <a href=""""),_display_(/*15.60*/routes/*15.66*/.Application.admin()),format.raw/*15.86*/("""">admin area</a>.</p>
  		""")))}/*17.5*/case "" =>/*17.15*/ {_display_(Seq[Any](format.raw/*17.17*/("""
  		  """),format.raw/*18.7*/("""Welcome guest.
  		""")))}}),format.raw/*20.2*/("""		
	"""),format.raw/*21.2*/("""</div>
</div>

<h1>Admin Area</h1>

<div class="my-form-container">
"""),_display_(/*27.2*/helper/*27.8*/.form(routes.Application.registerLocation, 'role -> "form", 'id -> "location-form")/*27.91*/ {_display_(Seq[Any](format.raw/*27.93*/("""
"""),format.raw/*28.1*/("""<p></p>
   <h3>Location - Please fill in location form</h3>
  
      <div class="form-group">
    		<label for="name">Name:</label>
      	<input type="text" class="form-control" name="name" id="name" placeholder="name">
      </div>
   	<div class="form-group">
    		<label for="address">Address:</label>
      	<input type="text" class="form-control" name="address" id="address" placeholder="address">
      </div>
      <div class="form-group">
    		<label for="latitude">Latitude:</label>
      	<input type="text" class="form-control" name="latitude" id="latitude" placeholder="latitude">
      </div>
      <div class="form-group">
    		<label for="longitude">Longitude:</label>
      	<input type="text" class="form-control" name="longitude" id="longitude" placeholder="longitude">
      </div>
      <button type="submit" class="btn btn-default">Submit</button>
      """),_display_(/*48.8*/if(form1.hasGlobalErrors)/*48.33*/ {_display_(Seq[Any](format.raw/*48.35*/("""
    	"""),format.raw/*49.6*/("""<p class="error">
     	   """),_display_(/*50.11*/form1/*50.16*/.globalError.message),format.raw/*50.36*/("""
   	 """),format.raw/*51.6*/("""</p>
		""")))}),format.raw/*52.4*/("""
		"""),_display_(/*53.4*/if(flash.contains("errorlocation"))/*53.39*/ {_display_(Seq[Any](format.raw/*53.41*/("""
    	"""),format.raw/*54.6*/("""<p class="error">
     	   """),_display_(/*55.11*/flash/*55.16*/.get("errorlocation")),format.raw/*55.37*/("""
    	"""),format.raw/*56.6*/("""</p>
		""")))}),format.raw/*57.4*/("""
		"""),_display_(/*58.4*/if(flash.contains("successlocation"))/*58.41*/ {_display_(Seq[Any](format.raw/*58.43*/("""
    	"""),format.raw/*59.6*/("""<p class="success">
     	   """),_display_(/*60.11*/flash/*60.16*/.get("successlocation")),format.raw/*60.39*/("""
    	"""),format.raw/*61.6*/("""</p>
		""")))}),format.raw/*62.4*/("""
""")))}),format.raw/*63.2*/("""</div>




<div class="my-form-container">
"""),_display_(/*69.2*/helper/*69.8*/.form(routes.Application.registerEvent, 'role -> "form", 'id -> "event-form")/*69.85*/ {_display_(Seq[Any](format.raw/*69.87*/("""
"""),format.raw/*70.1*/("""<p></p>
   <h3>Event - Please fill in event form</h3>
      <div class="form-group">
    		<label for="description">Description:</label>
    		<textarea class="form-control" name="description" id="description" placeholder="description" rows="10" cols="70"></textarea>
      	<!--<input type="text" class="form-control" name="description" id="description" placeholder="description">-->
      </div>
   	<div class="form-group">
    		<label for="day_start">Start date (YYYY-mm-dd):</label>
      	<input type="date" class="form-control" name="day_start" id="day_start" placeholder="day_start">
      </div>
      <div class="form-group">
    		<label for="day_end">End date (YYYY-mm-dd):</label>
      	<input type="date" class="form-control" name="day_end" id="day_end" placeholder="day_end">
      </div>
      <div class="form-group">
    		<label for="hours">Hours:</label>
      	<input type="text" class="form-control" name="hours" id="hours" placeholder="hours">
      </div>
      <div class="form-group">
			<label for="location_id">Location:</label>
			<select class="form-control" class="form-control" name="location_id" id="location_id" placeholder="location">
				"""),_display_(/*92.6*/for(location <- locations) yield /*92.32*/{_display_(Seq[Any](format.raw/*92.33*/("""
 				"""),format.raw/*93.6*/("""<option value="""),_display_(/*93.21*/location/*93.29*/.id),format.raw/*93.32*/(""">"""),_display_(/*93.34*/location/*93.42*/.id),format.raw/*93.45*/(""" """),_display_(/*93.47*/location/*93.55*/.name),format.raw/*93.60*/("""  """),_display_(/*93.63*/location/*93.71*/.address),format.raw/*93.79*/(""" """),_display_(/*93.81*/location/*93.89*/.latitude),format.raw/*93.98*/(""" """),_display_(/*93.100*/location/*93.108*/.longitude),format.raw/*93.118*/("""</option>   
				""")))}),format.raw/*94.6*/("""
			"""),format.raw/*95.4*/("""</select> 
		</div>
      <button type="submit" class="btn btn-default">Submit</button>
      """),_display_(/*98.8*/if(form2.hasGlobalErrors)/*98.33*/ {_display_(Seq[Any](format.raw/*98.35*/("""
    	"""),format.raw/*99.6*/("""<p class="error">
     	   """),_display_(/*100.11*/form2/*100.16*/.globalError.message),format.raw/*100.36*/("""
   	 """),format.raw/*101.6*/("""</p>
		""")))}),format.raw/*102.4*/("""
		"""),_display_(/*103.4*/if(flash.contains("errorevent"))/*103.36*/ {_display_(Seq[Any](format.raw/*103.38*/("""
    	"""),format.raw/*104.6*/("""<p class="error">
     	   """),_display_(/*105.11*/flash/*105.16*/.get("errorevent")),format.raw/*105.34*/("""
    	"""),format.raw/*106.6*/("""</p>
		""")))}),format.raw/*107.4*/("""
		"""),_display_(/*108.4*/if(flash.contains("successevent"))/*108.38*/ {_display_(Seq[Any](format.raw/*108.40*/("""
    	"""),format.raw/*109.6*/("""<p class="success">
     	   """),_display_(/*110.11*/flash/*110.16*/.get("successevent")),format.raw/*110.36*/("""
    	"""),format.raw/*111.6*/("""</p>
		""")))}),format.raw/*112.4*/("""
""")))}),format.raw/*113.2*/("""</div>











""")))}))
      }
    }
  }

  def render(form1:Form[Application.RegisterLocation],form2:Form[Application.RegisterEvent],locations:List[Location],username:String,role:String,user:User,events:List[Event]): play.twirl.api.HtmlFormat.Appendable = apply(form1,form2,locations,username,role,user,events)

  def f:((Form[Application.RegisterLocation],Form[Application.RegisterEvent],List[Location],String,String,User,List[Event]) => play.twirl.api.HtmlFormat.Appendable) = (form1,form2,locations,username,role,user,events) => apply(form1,form2,locations,username,role,user,events)

  def ref: this.type = this

}


}

/**/
object admin extends admin_Scope0.admin
              /*
                  -- GENERATED --
                  DATE: Mon Nov 19 03:25:43 EET 2018
                  SOURCE: /home/myapos/Desktop/myProjects/EventManager/app/views/admin.scala.html
                  HASH: 88b88f869ca715ab93e763f5c7b67d561c3851b0
                  MATRIX: 851->1|1117->171|1144->173|1193->214|1232->216|1260->218|1435->368|1447->372|1461->378|1470->387|1492->401|1531->403|1565->410|1602->420|1631->428|1692->462|1717->466|1756->478|1771->484|1814->505|1850->528|1874->543|1914->545|1948->552|1988->565|2017->573|2078->607|2103->611|2189->670|2204->676|2246->697|2350->774|2365->780|2406->800|2451->832|2470->842|2510->844|2544->851|2595->873|2626->877|2721->946|2735->952|2827->1035|2867->1037|2895->1038|3801->1918|3835->1943|3875->1945|3908->1951|3963->1979|3977->1984|4018->2004|4051->2010|4089->2018|4119->2022|4163->2057|4203->2059|4236->2065|4291->2093|4305->2098|4347->2119|4380->2125|4418->2133|4448->2137|4494->2174|4534->2176|4567->2182|4624->2212|4638->2217|4682->2240|4715->2246|4753->2254|4785->2256|4855->2300|4869->2306|4955->2383|4995->2385|5023->2386|6226->3563|6268->3589|6307->3590|6340->3596|6382->3611|6399->3619|6423->3622|6452->3624|6469->3632|6493->3635|6522->3637|6539->3645|6565->3650|6595->3653|6612->3661|6641->3669|6670->3671|6687->3679|6717->3688|6747->3690|6765->3698|6797->3708|6845->3726|6876->3730|6997->3825|7031->3850|7071->3852|7104->3858|7160->3886|7175->3891|7217->3911|7251->3917|7290->3925|7321->3929|7363->3961|7404->3963|7438->3969|7494->3997|7509->4002|7549->4020|7583->4026|7622->4034|7653->4038|7697->4072|7738->4074|7772->4080|7830->4110|7845->4115|7887->4135|7921->4141|7960->4149|7993->4151
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|39->8|39->8|39->8|39->9|39->9|39->9|40->10|40->10|40->10|40->10|40->10|40->10|40->10|40->10|41->12|41->12|41->12|42->13|42->13|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|45->17|45->17|45->17|46->18|47->20|48->21|54->27|54->27|54->27|54->27|55->28|75->48|75->48|75->48|76->49|77->50|77->50|77->50|78->51|79->52|80->53|80->53|80->53|81->54|82->55|82->55|82->55|83->56|84->57|85->58|85->58|85->58|86->59|87->60|87->60|87->60|88->61|89->62|90->63|96->69|96->69|96->69|96->69|97->70|119->92|119->92|119->92|120->93|120->93|120->93|120->93|120->93|120->93|120->93|120->93|120->93|120->93|120->93|120->93|120->93|120->93|120->93|120->93|120->93|120->93|120->93|121->94|122->95|125->98|125->98|125->98|126->99|127->100|127->100|127->100|128->101|129->102|130->103|130->103|130->103|131->104|132->105|132->105|132->105|133->106|134->107|135->108|135->108|135->108|136->109|137->110|137->110|137->110|138->111|139->112|140->113
                  -- GENERATED --
              */
          