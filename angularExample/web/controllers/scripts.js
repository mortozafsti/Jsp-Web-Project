<script src="js/angular.min.js"></script>


var app = angular.module("muApp", ["ngRoute"])
  .config(function ($routeProvider) {
    $routeProvider.when("/home", {
        templateUrl: "template/home.html",
        controller: "homecontroller" 
    }).when("/course", {
        templateUrl: "course.html",
        controller: "coursecontroller" 
    }).when("/students", {
        templateUrl: "students.html",
        controller: "studentscontroller" 
    });
})
.controller("homecontroller", function ($scope){ 
    $scope.message = "Home Page";
})
.controller("coursecontroller", function ($scope){ 
    $scope.courses = ["C#","VB.Net","Java","PHP","Angular JS"];
});

