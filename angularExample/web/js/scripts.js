//<script src="js/angular.min.js"></script>

var app = angular.module("muApp", ["ngRoute"]);
  app.config(function ($routeProvider) {
    $routeProvider.when("/home", {
        templateUrl: "template/home.html",
        controller: "homecontroller" 
    }).when("/course", {
        templateUrl: "template/course.html",
        controller: "coursecontroller" 
    });
  });
app.controller("homecontroller", function ($scope){ 
    $scope.homehtml = "This is Home Page";
});
app.controller("coursecontroller", function ($scope){ 
    $scope.courses = ["C#","VB.Net","Java","PHP","Angular JS"];
});

