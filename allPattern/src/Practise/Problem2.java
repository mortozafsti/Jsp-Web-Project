package Practise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        double n = 3.14159;
        double A = n * r * r;

       // System.out.printf("A=%.4f\n", A);
        System.out.println(new DecimalFormat("0.00000").format(A));
    }
}
