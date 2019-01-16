/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


angular.module("sportStore")
.controller("sportsStoreCtrl",function ($scope){ 
        
       $scope.data = { 
         products: [
             {name: "Product #1", description: "A product", category: "Category 1", price: 100},
             {name: "Product #2", description: "B product", category: "Category 2", price: 200},
             {name: "Product #3", description: "C product", category: "Category 3", price: 300},
             {name: "Product #4", description: "D product", category: "Category 4", price: 400}
         ]  
       }; 
        
    });