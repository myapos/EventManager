//alert("This is a test");

//Google maps API initialisation
/*
var myLatlng = new google.maps.LatLng(35.3220164, 25.1350708);
var element = document.getElementById("map");
 
var map = new google.maps.Map(element, {
  center: myLatlng,
  zoom: 13,
  mapTypeId: "OSM",
  mapTypeControl: true,
  streetViewControl: true
});
var marker = new google.maps.Marker({
      position: myLatlng,
      map: map,
      title: 'Hello World!'
  });
var infowindow = new google.maps.InfoWindow();

google.maps.event.addListener(marker, 'click', (function(marker) {
        return function() {
          infowindow.setContent("Hello infowindow");
          infowindow.open(map, marker);
        }
      })(marker));
    
*/
/*
 var locations = [
      ['Androgeo', 35.3397518, 25.1340181, 4],
      ['Kipotheatro Kazantzakis', 35.332105, 25.131702, 5],
      ['Pili Bithleem', 35.3345449,25.1277602, 3],
      ['Pili Bitouri', 35.334279,25.1347117, 2],
      ['Plateia Eleutherias', 35.3380048,25.1359151, 1]
    ];*/
 
 /*
 var locations = [
      ['Androgeo', 35.339409,25.1343932],
      ['Kipotheatro Kazantzakis', 35.332105, 25.131702],
      ['Pili Bithleem', 35.3345449,25.1277602],
      ['Pili Bitouri', 35.334279,25.1347117],
      ['Plateia Eleutherias', 35.3380048,25.1359151]
    ];*/
    
    var locations = [
    @for((myevent, index) <- events.zipWithIndex) {
        	@if(index <= events.size-2) { 
   		 		{
   		      ['@myevent.description',
             	 @event.location.latitude,
           	 	 @event.location.longitude]
   		 		},} else{		
   		 			{
   		      		['@myevent.description',
             			 @event.location.latitude,
           	 			 @event.location.longitude]
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