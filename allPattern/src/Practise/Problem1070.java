package Practise;

import java.io.IOException;
import java.util.Scanner;

public class Problem1070 {

    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        
        int X = scan.nextInt();
        int sixConsecutiveNumber = 6; 
        
        for (int i = X; i < ( X + (sixConsecutiveNumber * 2)) ; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
