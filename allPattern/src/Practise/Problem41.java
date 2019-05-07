package Practise;

import java.util.Scanner;

public class Problem41 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float X = scan.nextFloat();
        float Y = scan.nextFloat();
        
        if ( X == 0.0 && Y == 0.0) {
            System.out.println("Origem");
        }else if( X == 0.0 && Y != 0.0 ){ 
            System.out.println("Eixo Y");
        }else if( Y == 0.0 && X != 0.0 ){ 
            System.out.println("Eixo X");
        }else if( X > 0.0 ){ 
            if (Y > 0.0) {
                System.out.println("Q1");
            }else{ 
                System.out.println("Q4");
            }
        }else if( Y > 0.0){ 
            System.out.println("Q2");
        }else{ 
            System.out.println("Q3");
        }
      
    }
} 

    