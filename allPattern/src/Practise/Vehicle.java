/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practise;

/**
 *
 * @author Cf-37
 */
public class Vehicle {
    int x;

    public Vehicle() {
        this(10);
    }

    public Vehicle(int x) {
        this.x = x;
    }
    
}
class Car extends Vehicle{
    int y;
    public Car() {
        
        this(20);
    }

    public Car(int y) {
        this.y = y;
    }
    public String ssss(){
        return super.x + ":" + this.y;
    }
    
}
class MyString{
    String msg;

    public MyString(String msg) {
        this.msg = msg;
    }
}
class Test{
    public static void main(String[] args) {
//        System.out.println("Hello "+ new StringBuilder("Java SE 8 "));
//        System.out.println("Hello "+ new MyString("Java SE 8 "));
System.out.println("String Main: " + args[0]);
    }
    
}

