function initMap() {
	var mapProp = {
		center: new google.maps.LatLng(40.038814, -83.011255), 
		zoom: 4,
	};
	var map = new google.maps.Map(document.getElementById("map"), mapProp);
}