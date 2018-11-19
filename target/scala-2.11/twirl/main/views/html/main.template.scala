
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,User,List[Event],Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: User,events: List[Event])(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.64*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="el">
  <head>
  <meta charset="utf-8">
  
  <title>"""),_display_(/*7.11*/title),format.raw/*7.16*/("""</title>
  <script type="text/javascript" src=""""),_display_(/*8.40*/routes/*8.46*/.Assets.at("javascripts/jquery-2.1.4.min.js")),format.raw/*8.91*/(""""></script>
  <script type="text/javascript" src=""""),_display_(/*9.40*/routes/*9.46*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*9.88*/(""""></script>
  <link rel="stylesheet" media="screen" href=""""),_display_(/*10.48*/routes/*10.54*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*10.97*/(""""/>
  <link rel="stylesheet" media="screen" href=""""),_display_(/*11.48*/routes/*11.54*/.Assets.at("stylesheets/main.css")),format.raw/*11.88*/(""""/>
  <link rel='stylesheet' href=""""),_display_(/*12.33*/routes/*12.39*/.Assets.at("stylesheets/fullcalendar.css")),format.raw/*12.81*/(""""/> 
  
  
  <!-- bring in the google maps library  -->
  <script type="text/javascript" src="http://maps.googleapis.com/maps/api/js?sensor=false"></script>
	
  <script src=""""),_display_(/*18.17*/routes/*18.23*/.Assets.at("javascripts/moment.min.js")),format.raw/*18.62*/(""""></script>
  <script src=""""),_display_(/*19.17*/routes/*19.23*/.Assets.at("javascripts/fullcalendar.js")),format.raw/*19.64*/(""""></script>
  <script src=""""),_display_(/*20.17*/routes/*20.23*/.Assets.at("javascripts/jquery.totemticker.js")),format.raw/*20.70*/(""""></script>
  
  
<script type="text/javascript">
$(document).ready(function() """),format.raw/*24.30*/("""{"""),format.raw/*24.31*/("""


"""),format.raw/*27.1*/("""$('#calendar').fullCalendar("""),format.raw/*27.29*/("""{"""),format.raw/*27.30*/("""

        """),format.raw/*29.9*/("""// put your options and callbacks here
        /*dayClick: function() """),format.raw/*30.32*/("""{"""),format.raw/*30.33*/("""
        """),format.raw/*31.9*/("""alert('a day has been clicked!');
    """),format.raw/*32.5*/("""}"""),format.raw/*32.6*/("""*/
    
    
    
	
	events: [
        
        """),_display_(/*39.10*/for((myevent, index) <- events.zipWithIndex) yield /*39.54*/ {_display_(Seq[Any](format.raw/*39.56*/("""
    		
			"""),_display_(/*41.5*/if(index <= events.size-2)/*41.31*/{_display_(Seq[Any](format.raw/*41.32*/("""
       		 """),format.raw/*42.11*/("""{"""),format.raw/*42.12*/("""
           	 	"""),format.raw/*43.15*/("""title  : '"""),_display_(/*43.26*/myevent/*43.33*/.description),format.raw/*43.45*/("""',
           	 	start  : '"""),_display_(/*44.26*/myevent/*44.33*/.day_start),format.raw/*44.43*/("""',
            	end    : '"""),_display_(/*45.25*/myevent/*45.32*/.day_end),format.raw/*45.40*/("""'
       		 """),format.raw/*46.11*/("""}"""),format.raw/*46.12*/(""",
       	""")))}/*47.11*/else/*47.16*/{_display_(Seq[Any](format.raw/*47.17*/("""
       			"""),format.raw/*48.11*/("""{"""),format.raw/*48.12*/("""
           	 	"""),format.raw/*49.15*/("""title  : '"""),_display_(/*49.26*/myevent/*49.33*/.description),format.raw/*49.45*/("""',
           	 	start  : '"""),_display_(/*50.26*/myevent/*50.33*/.day_start),format.raw/*50.43*/("""',
            	end    : '"""),_display_(/*51.25*/myevent/*51.32*/.day_end),format.raw/*51.40*/("""'
       		 """),format.raw/*52.11*/("""}"""),format.raw/*52.12*/("""
       	
       	""")))}),format.raw/*54.10*/("""
        
        """)))}),format.raw/*56.10*/("""
    """),format.raw/*57.5*/("""],
    eventClick: function(calEvent, jsEvent, view) """),format.raw/*58.51*/("""{"""),format.raw/*58.52*/("""

        """),format.raw/*60.9*/("""alert('Event: ' + calEvent.title);

        // change the border color just for fun
        $(this).css('border-color', 'yellow');

    """),format.raw/*65.5*/("""}"""),format.raw/*65.6*/(""",
    
    header:"""),format.raw/*67.12*/("""{"""),format.raw/*67.13*/("""
    """),format.raw/*68.5*/("""left:   'title',
    center: '',
    right:  'today month agendaWeek agendaDay prev,next'
    """),format.raw/*71.5*/("""}"""),format.raw/*71.6*/("""
	
    """),format.raw/*73.5*/("""/*
    events: [
        """),format.raw/*75.9*/("""{"""),format.raw/*75.10*/("""
            """),format.raw/*76.13*/("""title  : 'event1',
            start  : '2015-07-12'
        """),format.raw/*78.9*/("""}"""),format.raw/*78.10*/(""",
        """),format.raw/*79.9*/("""{"""),format.raw/*79.10*/("""
            """),format.raw/*80.13*/("""title  : 'event2',
            start  : '2015-07-22',
            end    : '2015-07-26'
        """),format.raw/*83.9*/("""}"""),format.raw/*83.10*/(""",
        """),format.raw/*84.9*/("""{"""),format.raw/*84.10*/("""
            """),format.raw/*85.13*/("""title  : 'event3',
            start  : '2015-07-09T12:30:00',
            allDay : false // will make the time show
        """),format.raw/*88.9*/("""}"""),format.raw/*88.10*/("""
    """),format.raw/*89.5*/("""],
    
    header:"""),format.raw/*91.12*/("""{"""),format.raw/*91.13*/("""
    """),format.raw/*92.5*/("""left:   'title',
    center: '',
    right:  'today month agendaWeek agendaDay prev,next'
    """),format.raw/*95.5*/("""}"""),format.raw/*95.6*/("""
    """),format.raw/*96.5*/("""*/
    """),format.raw/*97.5*/("""}"""),format.raw/*97.6*/(""");


$("#vertical-ticker").totemticker("""),format.raw/*100.35*/("""{"""),format.raw/*100.36*/("""
		"""),format.raw/*101.3*/("""row_height:'100px', // Height of each ticker row in PX
		next:'#ticker-next', // ID of next button or link
		previous:'#ticker-previous', // ID of previous button or link
		stop:'#stop', // ID of stop button or link
		start:'#start', // ID of start button or link
		mousestop:true, // Stop while mouse is hovers over it
		speed: 800, // Speed of transition animation (ms)
		interval: 3000, // Time between change (ms)
		max_items: 4 // Maximum items to display 
"""),format.raw/*110.1*/("""}"""),format.raw/*110.2*/(""");


"""),format.raw/*113.1*/("""}"""),format.raw/*113.2*/(""");
</script>  

</head>
<body>
<div class="big_wrapper">  
<div class="container">
	<div class="row">
       <div class="col-xs-12">
		 	<nav class="navbar navbar-inverse custom-nav">
			  <div class="container-fluid">
			    <div class="navbar-header">
			      <a class="navbar-brand" href="./" id="link1">Home</a>
			    </div>
			    <div>
			      <ul class="nav navbar-nav">	
						<!--<li><a href="./services" id="link5">Services</a></li> 
						<li><a href="./contact" id="link6">Contact Us</a></li> -->
						<li><a href="./register" id="link7">Register</a></li> 
						<li><a href="./links" id="link8">Links</a></li> 
						<li><a href="./login" id="link9">Login</a></li> 
			      </ul>
			      </ul>
			    </div>
		
			  </div>	
			</nav>	
			 		 
		</div>
	</div>

   
   <section class="content">"""),_display_(/*145.30*/content),format.raw/*145.37*/("""</section>
 
    <div class="row footer" id="bottom-footer">
        <div class="col-xs-5">
           	<ul class="nav navbar-nav rrssb-buttons clearfix">
					<li class="active">
						<a href="http://getbootstrap.com/" target="_blank">
							<img class="img-responsive center-block" src=""""),_display_(/*152.55*/routes/*152.61*/.Assets.at("images/logos/logoBootstrap.png")),format.raw/*152.105*/("""" alt="Bootstrap">
						</a>
					</li>
					<li class="active">
						<a href="https://ellak.gr/" target="_blank">
							<img class="img-responsive center-block" src=""""),_display_(/*157.55*/routes/*157.61*/.Assets.at("images/logos/logoEllak.png")),format.raw/*157.101*/("""" alt="Ellak"></a>
					</li>
					<li class="active">
						<a href="https://ma.ellak.gr/" target="_blank">
							<img class="img-responsive center-block" src=""""),_display_(/*161.55*/routes/*161.61*/.Assets.at("images/logos/logoMonadesAristeias.png")),format.raw/*161.112*/("""" alt="Monades Aristeias">
						</a>
					</li>
					<li class="active">
						<a href="http://www.uoc.gr/" target="_blank">
							<img class="img-responsive center-block" src=""""),_display_(/*166.55*/routes/*166.61*/.Assets.at("images/logos/logoPK.png")),format.raw/*166.98*/("""" alt="University Of Crete">
						</a>
					</li>
  					<li class="rrssb-facebook">
    					<a href="https://www.facebook.com/sharer/sharer.php?u=http://147.52.17.225:9000/" class="popup">
      				<span class="rrssb-icon">
        					<svg xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid" width="29" height="29" viewBox="0 0 29 29">
        			 			<path d="M26.4 0H2.6C1.714 0 0 1.715 0 2.6v23.8c0 .884 1.715 2.6 2.6 2.6h12.393V17.988h-3.996v-3.98h3.997v-3.062c0-3.746 2.835-5.97 6.177-5.97 1.6 0 2.444.173 2.845.226v3.792H21.18c-1.817 0-2.156.9-2.156 2.168v2.847h5.045l-.66 3.978h-4.386V29H26.4c.884 0 2.6-1.716 2.6-2.6V2.6c0-.885-1.716-2.6-2.6-2.6z"
          					class="cls-2" fill-rule="evenodd"/>
        					</svg>
      				</span>
    					</a>
  					</li>  
  					<li class="rrssb-twitter">
   				 	<a href="https://twitter.com/intent/tweet?text=http://147.52.17.225:9000/"	class="popup">
      					<span class="rrssb-icon"><svg xmlns="http://www.w3.org/2000/svg" width="28" height="28" viewBox="0 0 28 28"><path d="M24.253 8.756C24.69 17.08 18.297 24.182 9.97 24.62c-3.122.162-6.22-.646-8.86-2.32 2.702.18 5.375-.648 7.507-2.32-2.072-.248-3.818-1.662-4.49-3.64.802.13 1.62.077 2.4-.154-2.482-.466-4.312-2.586-4.412-5.11.688.276 1.426.408 2.168.387-2.135-1.65-2.73-4.62-1.394-6.965C5.574 7.816 9.54 9.84 13.802 10.07c-.842-2.738.694-5.64 3.434-6.48 2.018-.624 4.212.043 5.546 1.682 1.186-.213 2.318-.662 3.33-1.317-.386 1.256-1.248 2.312-2.4 2.942 1.048-.106 2.07-.394 3.02-.85-.458 1.182-1.343 2.15-2.48 2.71z"/></svg></span>
   			 		</a>
  					</li>
  				</ul>
      </div>
      <div class="col-xs-4">
          <p id="footerdevelopment">Website development 
              <div class="row">
       				<div class="col-xs-12">
	                	<a href="http://myapos.oncrete.gr" target="_blank">Apostolakis Myron</a>
   					</div>
   					</div>   
   				<div class="row">
       				<div class="col-xs-12">          	    		
                	  	<a href="http://www.csd.uoc.gr/~mkoutsog/" target="_blank">Koutsogiannaki Maria</a>
                	</div>
   				</div> 
           </p>
       </div>
       <div class="col-xs-3">
         <p id="footercodeschool">&COPY; Monades Aristeias Logismikou - <a href="https://ma.ellak.gr/edu/course/view.php?id=52" target="_blank">3nd Code School</a></p>
       </div>
   </div>      
</div>
</div> <!--end of big_wrapper--> 

</body>
  
</html>
"""))
      }
    }
  }

  def render(title:String,user:User,events:List[Event],content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user,events)(content)

  def f:((String,User,List[Event]) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user,events) => (content) => apply(title,user,events)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Mon Nov 19 03:25:43 EET 2018
                  SOURCE: /home/myapos/Desktop/myProjects/EventManager/app/views/main.scala.html
                  HASH: 3ace4670b8e0f820dbeca6ba6ad1cf7724ce5d23
                  MATRIX: 765->1|922->63|949->64|1055->144|1080->149|1154->197|1168->203|1233->248|1310->299|1324->305|1386->347|1472->406|1487->412|1551->455|1629->506|1644->512|1699->546|1762->582|1777->588|1840->630|2042->805|2057->811|2117->850|2172->878|2187->884|2249->925|2304->953|2319->959|2387->1006|2494->1085|2523->1086|2553->1089|2609->1117|2638->1118|2675->1128|2773->1198|2802->1199|2838->1208|2903->1246|2931->1247|3007->1296|3067->1340|3107->1342|3145->1354|3180->1380|3219->1381|3258->1392|3287->1393|3330->1408|3368->1419|3384->1426|3417->1438|3472->1466|3488->1473|3519->1483|3573->1510|3589->1517|3618->1525|3658->1537|3687->1538|3717->1550|3730->1555|3769->1556|3808->1567|3837->1568|3880->1583|3918->1594|3934->1601|3967->1613|4022->1641|4038->1648|4069->1658|4123->1685|4139->1692|4168->1700|4208->1712|4237->1713|4287->1732|4337->1751|4369->1756|4450->1809|4479->1810|4516->1820|4679->1956|4707->1957|4753->1975|4782->1976|4814->1981|4935->2075|4963->2076|4997->2083|5049->2108|5078->2109|5119->2122|5207->2183|5236->2184|5273->2194|5302->2195|5343->2208|5466->2304|5495->2305|5532->2315|5561->2316|5602->2329|5754->2454|5783->2455|5815->2460|5862->2479|5891->2480|5923->2485|6044->2579|6072->2580|6104->2585|6138->2592|6166->2593|6234->2632|6264->2633|6295->2636|6785->3098|6814->3099|6847->3104|6876->3105|7717->3918|7746->3925|8066->4217|8082->4223|8149->4267|8348->4438|8364->4444|8427->4484|8618->4647|8634->4653|8708->4704|8916->4884|8932->4890|8991->4927
                  LINES: 27->1|32->1|33->2|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|55->24|55->24|58->27|58->27|58->27|60->29|61->30|61->30|62->31|63->32|63->32|70->39|70->39|70->39|72->41|72->41|72->41|73->42|73->42|74->43|74->43|74->43|74->43|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|78->47|78->47|78->47|79->48|79->48|80->49|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|83->52|83->52|85->54|87->56|88->57|89->58|89->58|91->60|96->65|96->65|98->67|98->67|99->68|102->71|102->71|104->73|106->75|106->75|107->76|109->78|109->78|110->79|110->79|111->80|114->83|114->83|115->84|115->84|116->85|119->88|119->88|120->89|122->91|122->91|123->92|126->95|126->95|127->96|128->97|128->97|131->100|131->100|132->101|141->110|141->110|144->113|144->113|176->145|176->145|183->152|183->152|183->152|188->157|188->157|188->157|192->161|192->161|192->161|197->166|197->166|197->166
                  -- GENERATED --
              */
          