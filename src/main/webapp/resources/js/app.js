var app = angular.module('app', ['ngRoute','ngResource']);
app.config(function($routeProvider){
    $routeProvider
        .when('/gallery',{
            templateUrl: 'resources/views/gallery.html',
            controller: 'galleryController'
        })
        .when('/contactus',{
            templateUrl: 'resources/views/contactus.html',
            controller: 'contactusController'
        })
        .when('/map',{
                    templateUrl: 'resources/views/map.html',
                    controller: 'mapController'
                })
        .otherwise(
            { redirectTo: '/'}
        );
});
