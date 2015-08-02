$(document).ready(function() {

alert("Helo from external jquery script");

var map = new OpenLayers.Map('map', {
    projection: new OpenLayers.Projection('EPSG:900913')
  });
  var osm = new OpenLayers.Layer.OSM();            
  var gmap = new OpenLayers.Layer.Google('Google street maps');
  var bing = new OpenLayers.Layer.Bing({
    key: 'register your api key at bingmapsportal.com',
    type: 'Road',
    metadataParams: { mapVersion: 'v1' }
  });
 
  map.addLayers([osm, gmap, bing]);
  map.setCenter(new OpenLayers.LonLat(2.2, 54.0)
    .transform(new OpenLayers.Projection('EPSG:4326'), map.getProjectionObject()), 5);
  map.addControl(new OpenLayers.Control.LayerSwitcher());

});
 
 