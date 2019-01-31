/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaknowledge;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Cf-37
 */

@Configuration
public class HelloConfig {
    
    @Bean
    public Hello hello(){ 
        return new Hello();
    }
    
}
