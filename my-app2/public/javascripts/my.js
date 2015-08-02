$(document).ready(function() {

alert("Helo from external jquery script");
var locations = [
      @for((myevent, index) <- events.zipWithIndex) {
    		
			@if(index <= events.size-2){
       		 {
           	 	['@myevent.location.name', @myevent.location.latitude ,@myevent.location.longitude],
       		 },
       	} else {
       			{
           	 	['@myevent.location.name', @myevent.location.latitude ,@myevent.location.longitude],
       		 }
       	
       	}
        
        }
    ];   
  
    var myLatlng = new google.maps.LatLng(35.3220164, 25.1350708);
	 var element = document.getElementById("map");
 
	var map = new google.maps.Map(element, {
 	  center: myLatlng,
 	  zoom: 13,
 	  mapTypeId: "OSM",
 	  mapTypeControl: true,
 	  streetViewControl: true
	 });
	 
    var infowindow = new google.maps.InfoWindow();
    var marker, i;
    var markers = new Array();
    for (i = 0; i < locations.length; i++) {  
      marker = new google.maps.Marker({
        position: new google.maps.LatLng(locations[i][1], locations[i][2]),
        map: map
      });
      markers.push(marker);
      google.maps.event.addListener(marker, 'click', (function(marker, i) {
        return function() {
          infowindow.setContent(locations[i][0]);
          infowindow.open(map, marker);
        }
      })(marker, i));
    }
    
    function AutoCenter() {
      //  Create a new viewpoint bound
      var bounds = new google.maps.LatLngBounds();
      //  Go through each...
      $.each(markers, function (index, marker) {
      bounds.extend(marker.position);
      });
      //  Fit these bounds to the map
      map.fitBounds(bounds);
    }
    AutoCenter();



//Define OSM map type pointing at the OpenStreetMap tile server
map.mapTypes.set("OSM", new google.maps.ImageMapType({
  getTileUrl: function(coord, zoom) {
  // "Wrap" x (logitude) at 180th meridian properly
  /* NB: Don't touch coord.x because coord param is by reference, and changing its x property 
  break's something in Google's lib */
  var tilesPerGlobe = 1 << zoom;
  var x = coord.x % tilesPerGlobe;
  if (x < 0) {
  x = tilesPerGlobe+x;
  }
  // Wrap y (latitude) in a like manner if you want to enable vertical infinite scroll
  return "http://tile.openstreetmap.org/" + zoom + "/" + x + "/" + coord.y + ".png";
  },
 tileSize: new google.maps.Size(256, 256),
 name: "OpenStreetMap",
 maxZoom: 18
}));
alert("Helo from external jquery script");


});
 
 