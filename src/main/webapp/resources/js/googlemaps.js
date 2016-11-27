// In the following example, markers appear when the user clicks on the map.
      // Each marker is labeled with a single alphabetical character.
      var labels = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
      var labelIndex = 0;
var position;
        if (navigator.geolocation) {
              position = navigator.geolocation.getCurrentPosition(getPosition);
        }
      function initialize() {
      }

      function getPosition(pos){
        position=pos;

                var bangalore = { lat: position.coords.latitude, lng: position.coords.longitude };
                var map = new google.maps.Map(document.getElementById('map'), {
                  zoom: 12,
                  center: bangalore
                });

                // This event listener calls addMarker() when the map is clicked.
                google.maps.event.addListener(map, 'click', function(event) {
                  addMarker(event.latLng, map);
                });

                // Add a marker at the center of the map.
                addMarker(bangalore, map);
      }

      // Adds a marker to the map.
      function addMarker(location, map) {
        // Add the marker at the clicked location, and add the next-available label
        // from the array of alphabetical characters.
        var marker = new google.maps.Marker({
          position: location,
          label: labels[labelIndex++ % labels.length],
          map: map
        });
        $("div.points").append("<p>"+ labels[labelIndex % labels.length] +"Position: "+location.lat +","+location.lng +"</p>");
      }

      google.maps.event.addDomListener(window, 'load', initialize);