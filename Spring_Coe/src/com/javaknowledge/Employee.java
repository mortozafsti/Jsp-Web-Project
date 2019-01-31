/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaknowledge;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Cf-37
 */
public class Employee {
    
    private Address address1;
    private Address address2;
    
    
//    private int id;
//    private String name;
//    private List<Address> address;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    
//    public Employee(int id, String name, List<Address> address) {
//        this.id = id;
//        this.name = name;
//        this.address = address;
//    }   
//    
//    public void show(){ 
//        System.out.println(id+" : "+name);
//        Iterator<Address> iterator = address.iterator();
//        while(iterator.hasNext()){ 
//            System.out.println(iterator.next());
//        }
//    }

    public Address getAddress1() {
        return address1;
    }

    public void setAddress1(Address address1) {
        this.address1 = address1;
    }

    public Address getAddress2() {
        return address2;
    }

    public void setAddress2(Address address2) {
        this.address2 = address2;
    }
    public void show(){ 
        System.out.println(address1);
        System.out.println(address2);
    }
}
