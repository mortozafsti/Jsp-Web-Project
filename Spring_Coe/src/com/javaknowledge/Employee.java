/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaknowledge;

import java.util.Iterator;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

/**
 *
 * @author Cf-37
 */
@Component
public class Employee {
    
    private Address address;

    public Address getAddress() {
        return address;
    }

//    @Autowired
    //@Qualifier("addqualifer")
    
    @Autowired
    @Qualifier("addqualifer")
//    @Resource(name = "address1")
    public void setAddress(Address address) {
        this.address = address;
    }
    
    
    
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

   
    public void show(){ 
        System.out.println(address.toString());
    }
}
