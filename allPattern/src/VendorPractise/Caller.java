/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VendorPractise;

/**
 *
 * @author Cf-37
 */
public class Caller {
     void init(){
        System.out.println("Initialized");
    }
     void start(){
        init();
        System.out.println("Started");
    }
    
}
class TestCall{
    public static void main(String[] args) {
        Caller c = new Caller();
        c.start();
        c.init();
    }
}