package Practise;

import java.util.Scanner;

public class Problem13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int X = scan.nextInt();
        float Y = scan.nextFloat();
        
        float total = (X / Y);
        System.out.printf("%.3f km/l\n",total);
    }
}
