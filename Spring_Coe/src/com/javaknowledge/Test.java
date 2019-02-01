/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaknowledge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Cf-37
 */
public class Test {
    
    public static void main(String[] args) {
        
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/javaknowledge/applicationContext.xml");
        
        context.registerShutdownHook();
        Hello hellow = (Hello) context.getBean("hello");
        hellow.setMessage("Hello Spring");
        System.out.println(hellow.getMessage());  
        
//        ApplicationContext context1 = new AnnotationConfigApplicationContext(HelloConfig.class);
//        
//        Hello hellow1 = (Hello) context1.getBean("hello");
//        hellow1.setMessage("Hello Spring 1");
//        System.out.println(hellow1.getMessage());
    }
}
