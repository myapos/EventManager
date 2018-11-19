
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object register_Scope0 {
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

class register extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Form[Application.RegisterUser],String,String,User,List[Event],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[Application.RegisterUser], username: String, role:String,user: User,events: List[Event]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.102*/("""
"""),_display_(/*2.2*/main(title = "Register Page", user, events)/*2.45*/ {_display_(Seq[Any](format.raw/*2.47*/("""
"""),format.raw/*3.1*/("""<div class="col-xs-12 welcome-msg">
        
      """),_display_(/*5.8*/role/*5.12*/ match/*5.18*/ {/*6.4*/case "user" =>/*6.18*/ {_display_(Seq[Any](format.raw/*6.20*/("""
 		   """),format.raw/*7.7*/("""Welcome, """),_display_(/*7.17*/username),format.raw/*7.25*/(""". Currently you are logged in as """),_display_(/*7.59*/role),format.raw/*7.63*/(""". <a href=""""),_display_(/*7.75*/routes/*7.81*/.Application.logout()),format.raw/*7.102*/("""">Logout</a>
  		""")))}/*9.5*/case "admin" =>/*9.20*/ {_display_(Seq[Any](format.raw/*9.22*/("""
  		  """),format.raw/*10.7*/("""<p>Welcome, """),_display_(/*10.20*/username),format.raw/*10.28*/(""". Currently you are logged in as """),_display_(/*10.62*/role),format.raw/*10.66*/(""". <br>
  		  If you want to logout click here:   <a href=""""),_display_(/*11.53*/routes/*11.59*/.Application.logout()),format.raw/*11.80*/("""">Logout</a> <br>
  		  If you want to upload an event click here: <a href=""""),_display_(/*12.60*/routes/*12.66*/.Application.admin()),format.raw/*12.86*/("""">admin area</a>.</p>
  		""")))}/*14.5*/case "" =>/*14.15*/ {_display_(Seq[Any](format.raw/*14.17*/("""
  		  """),format.raw/*15.7*/("""Welcome guest.
  		""")))}}),format.raw/*17.2*/("""		
"""),format.raw/*18.1*/("""</div>
<h1>Home page</h1>
<div class="my-form-container">
"""),_display_(/*21.2*/helper/*21.8*/.form(routes.Application.registerUser, 'role -> "form", 'id -> "register-form")/*21.87*/ {_display_(Seq[Any](format.raw/*21.89*/("""
"""),format.raw/*22.1*/("""<p></p>
   <h3>Register - Please fill in register form</h3>
  
      <div class="form-group">
    		<label for="name">Name:</label>
      	<input type="text" class="form-control" name="name" id="name" placeholder="name">
      </div>
   	<div class="form-group">
    		<label for="username">Username:</label>
      	<input type="text" class="form-control" name="username" id="username" placeholder="username">
      </div>
      <div class="form-group">
    		<label for="email">Email:</label>
      	<input type="email" class="form-control" name="email" id="email" placeholder="email">
      </div>
      <div class="form-group">
    		<label for="password">Password:</label>
      	<input type="text" class="form-control" name="password" id="password" placeholder="password">
      </div>
      <button type="submit" class="btn btn-default">Submit</button>
      
      """),_display_(/*43.8*/if(form.hasGlobalErrors)/*43.32*/ {_display_(Seq[Any](format.raw/*43.34*/("""
    	"""),format.raw/*44.6*/("""<p class="error">
     	   """),_display_(/*45.11*/form/*45.15*/.globalError.message),format.raw/*45.35*/("""
   	 """),format.raw/*46.6*/("""</p>
		""")))}),format.raw/*47.4*/("""
		"""),_display_(/*48.4*/if(flash.contains("error"))/*48.31*/ {_display_(Seq[Any](format.raw/*48.33*/("""
    	"""),format.raw/*49.6*/("""<p class="error">
     	   """),_display_(/*50.11*/flash/*50.16*/.get("error")),format.raw/*50.29*/("""
    	"""),format.raw/*51.6*/("""</p>
		""")))}),format.raw/*52.4*/("""
		"""),_display_(/*53.4*/if(flash.contains("success"))/*53.33*/ {_display_(Seq[Any](format.raw/*53.35*/("""
    	"""),format.raw/*54.6*/("""<p class="success">
     	   """),_display_(/*55.11*/flash/*55.16*/.get("success")),format.raw/*55.31*/("""
    	"""),format.raw/*56.6*/("""</p>
		""")))}),format.raw/*57.4*/("""
 
""")))}),format.raw/*59.2*/("""</div>
""")))}))
      }
    }
  }

  def render(form:Form[Application.RegisterUser],username:String,role:String,user:User,events:List[Event]): play.twirl.api.HtmlFormat.Appendable = apply(form,username,role,user,events)

  def f:((Form[Application.RegisterUser],String,String,User,List[Event]) => play.twirl.api.HtmlFormat.Appendable) = (form,username,role,user,events) => apply(form,username,role,user,events)

  def ref: this.type = this

}


}

/**/
object register extends register_Scope0.register
              /*
                  -- GENERATED --
                  DATE: Mon Nov 19 03:25:43 EET 2018
                  SOURCE: /home/myapos/Desktop/myProjects/EventManager/app/views/register.scala.html
                  HASH: e46ab34c164d92ea545efaef1f9c74cfc9d53235
                  MATRIX: 806->1|1002->101|1029->103|1080->146|1119->148|1146->149|1223->201|1235->205|1249->211|1258->220|1280->234|1319->236|1352->243|1388->253|1416->261|1476->295|1500->299|1538->311|1552->317|1594->338|1629->361|1652->376|1691->378|1725->385|1765->398|1794->406|1855->440|1880->444|1966->503|1981->509|2023->530|2127->607|2142->613|2183->633|2228->665|2247->675|2287->677|2321->684|2372->706|2402->709|2487->768|2501->774|2589->853|2629->855|2657->856|3556->1729|3589->1753|3629->1755|3662->1761|3717->1789|3730->1793|3771->1813|3804->1819|3842->1827|3872->1831|3908->1858|3948->1860|3981->1866|4036->1894|4050->1899|4084->1912|4117->1918|4155->1926|4185->1930|4223->1959|4263->1961|4296->1967|4353->1997|4367->2002|4403->2017|4436->2023|4474->2031|4508->2035
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|36->6|36->6|36->6|37->7|37->7|37->7|37->7|37->7|37->7|37->7|37->7|38->9|38->9|38->9|39->10|39->10|39->10|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|42->14|42->14|42->14|43->15|44->17|45->18|48->21|48->21|48->21|48->21|49->22|70->43|70->43|70->43|71->44|72->45|72->45|72->45|73->46|74->47|75->48|75->48|75->48|76->49|77->50|77->50|77->50|78->51|79->52|80->53|80->53|80->53|81->54|82->55|82->55|82->55|83->56|84->57|86->59
                  -- GENERATED --
              */
          