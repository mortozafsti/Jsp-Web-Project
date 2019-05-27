package Practise;

import java.util.Scanner;

public class Problem1074 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        
        for (int i = 1; i <= N; i++) {
           int  X = scan.nextInt();
            
            if (X == 0) {
                System.out.println("NULL");
            }else if(X % 2 != 0 && X < 0){
                System.out.println("ODD NEGATIVE");
            }else if(X % 2 != 0 && X > 0){
                System.out.println("ODD POSITIVE");
            }else if(X % 2 == 0 && X > 0){
                System.out.println("EVEN POSITIVE");
            }else{
                 System.out.println("EVEN NEGATIVE");
            }
        }

    }
}
