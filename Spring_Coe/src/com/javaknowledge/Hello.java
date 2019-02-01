/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaknowledge;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 *
 * @author Cf-37
 */
public class Hello{
    
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    @PostConstruct
    public void init(){ 
        System.out.println("Before initialization Bean 1");
    }
    
    @PreDestroy
    public void clear(){ 
        System.out.println("Before destroy Bean 1");
    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Before initialization Bean");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("Before destroy Bean");
//    }
    
}
