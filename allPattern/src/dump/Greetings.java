/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dump;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Cf-37
 */
public class Greetings {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2012, 01, 25);
        date.plusDays(15);
        System.out.println(date);
    }
    
}
