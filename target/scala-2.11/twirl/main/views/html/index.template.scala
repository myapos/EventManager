
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[Event],String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(events: List[Event],username: String, role:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.53*/("""
"""),_display_(/*2.2*/main(title = "Home", null,events)/*2.35*/ {_display_(Seq[Any](format.raw/*2.37*/("""

"""),format.raw/*4.1*/("""<div class="row"> 	  
	<div class="col-xs-4 welcome-msg"> </div>
	<div class="col-xs-4 welcome-msg"> </div>
	<div class="col-xs-4 welcome-msg">  
        
      """),_display_(/*9.8*/role/*9.12*/ match/*9.18*/ {/*10.4*/case "user" =>/*10.18*/ {_display_(Seq[Any](format.raw/*10.20*/("""
 		   """),format.raw/*11.7*/("""Welcome, """),_display_(/*11.17*/username),format.raw/*11.25*/(""". Currently you are logged in as """),_display_(/*11.59*/role),format.raw/*11.63*/(""". <a href=""""),_display_(/*11.75*/routes/*11.81*/.Application.logout()),format.raw/*11.102*/("""">Logout</a>
  		""")))}/*13.5*/case "admin" =>/*13.20*/ {_display_(Seq[Any](format.raw/*13.22*/("""
  		  """),format.raw/*14.7*/("""<p>Welcome, """),_display_(/*14.20*/username),format.raw/*14.28*/(""". Currently you are logged in as """),_display_(/*14.62*/role),format.raw/*14.66*/(""". <br>
  		  If you want to logout click here:   <a href=""""),_display_(/*15.53*/routes/*15.59*/.Application.logout()),format.raw/*15.80*/("""">Logout</a> <br>
  		  If you want to upload an event click here: <a href=""""),_display_(/*16.60*/routes/*16.66*/.Application.admin()),format.raw/*16.86*/("""">admin area</a>.</p>
  		""")))}/*18.5*/case "" =>/*18.15*/ {_display_(Seq[Any](format.raw/*18.17*/("""
  		  """),format.raw/*19.7*/("""Welcome guest.
  		""")))}}),format.raw/*21.2*/("""		
	"""),format.raw/*22.2*/("""</div>
</div>
<div class="row">  	  
        <div class="col-xs-12">
				<h1>Here you can see all events that are registered in our system</h1>			
			</div>
</div> 
<div class="row" >  	  
         <div class="col-xs-6" class="calendar-container">			
				<h3></h3>
				<div id="calendar"></div>
			</div>
		 <div class="col-xs-6" class="latest-events-container">			
				<h3>Latest Events</h3>
				<!--<div class="smartmarquee latest-events">-->
				<div class="latest-events">
				<ul id="vertical-ticker">
					<!-- -->
					"""),_display_(/*40.7*/for(event <- events) yield /*40.27*/{_display_(Seq[Any](format.raw/*40.28*/("""
 						"""),format.raw/*41.8*/("""<li> """),_display_(/*41.14*/event/*41.19*/.description),format.raw/*41.31*/("""	"""),_display_(/*41.33*/event/*41.38*/.day_start),format.raw/*41.48*/(""" """),format.raw/*41.49*/("""- """),_display_(/*41.52*/event/*41.57*/.day_end),format.raw/*41.65*/(""" """),_display_(/*41.67*/event/*41.72*/.hours),format.raw/*41.78*/(""" 
 						"""),_display_(/*42.9*/event/*42.14*/.location.name),format.raw/*42.28*/(""" """),_display_(/*42.30*/event/*42.35*/.location.address),format.raw/*42.52*/("""
 								
 						"""),format.raw/*44.8*/("""</li>   
    					""")))}),format.raw/*45.11*/("""	
				"""),format.raw/*46.5*/("""</ul>
			   </div>
			</div>
</div>
<!--
<div class="row">  	  
        <div class="col-xs-12" id="search-form">
				<div class="input-group">
     			 <input type="text" class="form-control" placeholder="Search for...">
      			<span class="input-group-btn">
       			 <button class="btn btn-default" type="button">Go!</button>
      			</span>
    			</div>
			</div>
</div> -->
<div class="row">  	  
        <div class="col-xs-12">			
				<h3>Event Map</h3>
				<div id="map"></div>
				<!--<script src=""""),_display_(/*65.23*/routes/*65.29*/.Assets.at("javascripts/my.js")),format.raw/*65.60*/(""""></script><-->
				<script type="text/javascript" >
				$(document).ready(function() """),format.raw/*67.34*/("""{"""),format.raw/*67.35*/("""

				"""),format.raw/*69.5*/("""//alert("Helo from external jquery script");
			var locations = [
     			 """),_display_(/*71.11*/for((myevent, index) <- events.zipWithIndex) yield /*71.55*/ {_display_(Seq[Any](format.raw/*71.57*/("""
    		
						"""),_display_(/*73.8*/if(index <= events.size-2)/*73.34*/{_display_(Seq[Any](format.raw/*73.35*/("""
       		 
         				  	 	"""),format.raw/*75.19*/("""['"""),_display_(/*75.22*/myevent/*75.29*/.location.name),format.raw/*75.43*/(""" """),_display_(/*75.45*/myevent/*75.52*/.description),format.raw/*75.64*/("""', """),_display_(/*75.68*/myevent/*75.75*/.location.latitude),format.raw/*75.93*/(""" """),format.raw/*75.94*/(""","""),_display_(/*75.96*/myevent/*75.103*/.location.longitude),format.raw/*75.122*/("""],
       		
       					""")))}/*77.15*/else/*77.20*/{_display_(Seq[Any](format.raw/*77.21*/("""
           	 					"""),format.raw/*78.19*/("""['"""),_display_(/*78.22*/myevent/*78.29*/.location.name),format.raw/*78.43*/(""" """),_display_(/*78.45*/myevent/*78.52*/.description),format.raw/*78.64*/("""', """),_display_(/*78.68*/myevent/*78.75*/.location.latitude),format.raw/*78.93*/(""" """),format.raw/*78.94*/(""","""),_display_(/*78.96*/myevent/*78.103*/.location.longitude),format.raw/*78.122*/("""]	
       					""")))}),format.raw/*79.14*/("""
        	
        					""")))}),format.raw/*81.15*/("""
   				 """),format.raw/*82.9*/("""];   
  
    			var myLatlng = new google.maps.LatLng(35.3220164, 25.1350708);
	 			var element = document.getElementById("map");
 
				var map = new google.maps.Map(element, """),format.raw/*87.44*/("""{"""),format.raw/*87.45*/("""
 	 			 """),format.raw/*88.8*/("""center: myLatlng,
 	 			 zoom: 13,
 	 			 mapTypeId: "OSM",
 	 			 mapTypeControl: true,
 	 			 streetViewControl: true
	 			"""),format.raw/*93.6*/("""}"""),format.raw/*93.7*/(""");
	 
    			var infowindow = new google.maps.InfoWindow();
    			var marker, i;
   			var markers = new Array();
    			for (i = 0; i < locations.length; i++) """),format.raw/*98.47*/("""{"""),format.raw/*98.48*/("""  
     			"""),format.raw/*99.9*/("""marker = new google.maps.Marker("""),format.raw/*99.41*/("""{"""),format.raw/*99.42*/("""
        		"""),format.raw/*100.11*/("""position: new google.maps.LatLng(locations[i][1], locations[i][2]),
        		map: map
     			 """),format.raw/*102.10*/("""}"""),format.raw/*102.11*/(""");
     			markers.push(marker);
      		google.maps.event.addListener(marker, 'click', (function(marker, i) """),format.raw/*104.77*/("""{"""),format.raw/*104.78*/("""
       		"""),format.raw/*105.10*/("""return function() """),format.raw/*105.28*/("""{"""),format.raw/*105.29*/("""
       	   """),format.raw/*106.12*/("""infowindow.setContent(locations[i][0]);
            infowindow.open(map, marker);
        """),format.raw/*108.9*/("""}"""),format.raw/*108.10*/("""
      """),format.raw/*109.7*/("""}"""),format.raw/*109.8*/(""")(marker, i));
    """),format.raw/*110.5*/("""}"""),format.raw/*110.6*/("""
    
    """),format.raw/*112.5*/("""function AutoCenter() """),format.raw/*112.27*/("""{"""),format.raw/*112.28*/("""
      """),format.raw/*113.7*/("""//  Create a new viewpoint bound
      var bounds = new google.maps.LatLngBounds();
      //  Go through each...
      $.each(markers, function (index, marker) """),format.raw/*116.48*/("""{"""),format.raw/*116.49*/("""
      """),format.raw/*117.7*/("""bounds.extend(marker.position);
      """),format.raw/*118.7*/("""}"""),format.raw/*118.8*/(""");
      //  Fit these bounds to the map
      map.fitBounds(bounds);
    """),format.raw/*121.5*/("""}"""),format.raw/*121.6*/("""
    """),format.raw/*122.5*/("""AutoCenter();



//Define OSM map type pointing at the OpenStreetMap tile server
map.mapTypes.set("OSM", new google.maps.ImageMapType("""),format.raw/*127.54*/("""{"""),format.raw/*127.55*/("""
  """),format.raw/*128.3*/("""getTileUrl: function(coord, zoom) """),format.raw/*128.37*/("""{"""),format.raw/*128.38*/("""
  """),format.raw/*129.3*/("""// "Wrap" x (logitude) at 180th meridian properly
  /* NB: Don't touch coord.x because coord param is by reference, and changing its x property 
  break's something in Google's lib */
  var tilesPerGlobe = 1 << zoom;
  var x = coord.x % tilesPerGlobe;
  if (x < 0) """),format.raw/*134.14*/("""{"""),format.raw/*134.15*/("""
  """),format.raw/*135.3*/("""x = tilesPerGlobe+x;
  """),format.raw/*136.3*/("""}"""),format.raw/*136.4*/("""
  """),format.raw/*137.3*/("""// Wrap y (latitude) in a like manner if you want to enable vertical infinite scroll
  return "http://tile.openstreetmap.org/" + zoom + "/" + x + "/" + coord.y + ".png";
  """),format.raw/*139.3*/("""}"""),format.raw/*139.4*/(""",
 tileSize: new google.maps.Size(256, 256),
 name: "OpenStreetMap",
 maxZoom: 18
"""),format.raw/*143.1*/("""}"""),format.raw/*143.2*/("""));
//alert("Helo from external jquery script");


"""),format.raw/*147.1*/("""}"""),format.raw/*147.2*/(""");
				</script>
			</div>
</div>
   
            

      

<!--
<script type="text/javascript">
            
</script>-->
""")))}))
      }
    }
  }

  def render(events:List[Event],username:String,role:String): play.twirl.api.HtmlFormat.Appendable = apply(events,username,role)

  def f:((List[Event],String,String) => play.twirl.api.HtmlFormat.Appendable) = (events,username,role) => apply(events,username,role)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Nov 19 03:25:43 EET 2018
                  SOURCE: /home/myapos/Desktop/myProjects/EventManager/app/views/index.scala.html
                  HASH: cb0a6de4713bc15d8c66d0dca00161a9161f4226
                  MATRIX: 764->1|910->52|937->54|978->87|1017->89|1045->91|1232->253|1244->257|1258->263|1268->272|1291->286|1331->288|1365->295|1402->305|1431->313|1492->347|1517->351|1556->363|1571->369|1614->390|1650->413|1674->428|1714->430|1748->437|1788->450|1817->458|1878->492|1903->496|1989->555|2004->561|2046->582|2150->659|2165->665|2206->685|2251->717|2270->727|2310->729|2344->736|2395->758|2426->762|2979->1289|3015->1309|3054->1310|3089->1318|3122->1324|3136->1329|3169->1341|3198->1343|3212->1348|3243->1358|3272->1359|3302->1362|3316->1367|3345->1375|3374->1377|3388->1382|3415->1388|3451->1398|3465->1403|3500->1417|3529->1419|3543->1424|3581->1441|3626->1459|3676->1478|3709->1484|4247->1995|4262->2001|4314->2032|4428->2118|4457->2119|4490->2125|4593->2201|4653->2245|4693->2247|4734->2262|4769->2288|4808->2289|4866->2319|4896->2322|4912->2329|4947->2343|4976->2345|4992->2352|5025->2364|5056->2368|5072->2375|5111->2393|5140->2394|5169->2396|5186->2403|5227->2422|5272->2449|5285->2454|5324->2455|5371->2474|5401->2477|5417->2484|5452->2498|5481->2500|5497->2507|5530->2519|5561->2523|5577->2530|5616->2548|5645->2549|5674->2551|5691->2558|5732->2577|5779->2593|5835->2618|5871->2627|6074->2802|6103->2803|6138->2811|6290->2936|6318->2937|6507->3098|6536->3099|6574->3110|6634->3142|6663->3143|6703->3154|6828->3250|6858->3251|6996->3360|7026->3361|7065->3371|7112->3389|7142->3390|7183->3402|7301->3492|7331->3493|7366->3500|7395->3501|7442->3520|7471->3521|7509->3531|7560->3553|7590->3554|7625->3561|7814->3721|7844->3722|7879->3729|7945->3767|7974->3768|8076->3842|8105->3843|8138->3848|8301->3982|8331->3983|8362->3986|8425->4020|8455->4021|8486->4024|8780->4289|8810->4290|8841->4293|8892->4316|8921->4317|8952->4320|9152->4492|9181->4493|9291->4575|9320->4576|9399->4627|9428->4628
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|40->9|40->9|40->9|40->10|40->10|40->10|41->11|41->11|41->11|41->11|41->11|41->11|41->11|41->11|42->13|42->13|42->13|43->14|43->14|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|46->18|46->18|46->18|47->19|48->21|49->22|67->40|67->40|67->40|68->41|68->41|68->41|68->41|68->41|68->41|68->41|68->41|68->41|68->41|68->41|68->41|68->41|68->41|69->42|69->42|69->42|69->42|69->42|69->42|71->44|72->45|73->46|92->65|92->65|92->65|94->67|94->67|96->69|98->71|98->71|98->71|100->73|100->73|100->73|102->75|102->75|102->75|102->75|102->75|102->75|102->75|102->75|102->75|102->75|102->75|102->75|102->75|102->75|104->77|104->77|104->77|105->78|105->78|105->78|105->78|105->78|105->78|105->78|105->78|105->78|105->78|105->78|105->78|105->78|105->78|106->79|108->81|109->82|114->87|114->87|115->88|120->93|120->93|125->98|125->98|126->99|126->99|126->99|127->100|129->102|129->102|131->104|131->104|132->105|132->105|132->105|133->106|135->108|135->108|136->109|136->109|137->110|137->110|139->112|139->112|139->112|140->113|143->116|143->116|144->117|145->118|145->118|148->121|148->121|149->122|154->127|154->127|155->128|155->128|155->128|156->129|161->134|161->134|162->135|163->136|163->136|164->137|166->139|166->139|170->143|170->143|174->147|174->147
                  -- GENERATED --
              */
          