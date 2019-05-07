package Practise;

import java.util.Scanner;

public class Problem42 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
         a = a + b;
         b = a - b;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
      
        
    }
} 

    