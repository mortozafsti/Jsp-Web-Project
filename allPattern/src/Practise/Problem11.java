package Practise;

import java.util.Scanner;

public class Problem11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double R = scan.nextDouble();
        double pi = 3.14159;
        
        double VOLUME = ((4/3.0) * pi * R * R *R);
                
        System.out.printf("VOLUME = %.3f\n",VOLUME);

    }
}
