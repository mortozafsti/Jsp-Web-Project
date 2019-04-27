/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dump;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Cf-37
 */
public class Problem11 {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now();
        System.out.println(d1);
        
        LocalDate d2 = LocalDate.of(2014, 06, 20);
        System.out.println(d2);
        
        LocalDate d3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
        System.out.println(d3);
    }
    
}
