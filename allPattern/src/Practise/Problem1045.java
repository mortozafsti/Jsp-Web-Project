package Practise;

import java.util.Scanner;

public class Problem1045 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else if (A * A == B * B + C * C) {
            System.out.println("TRIANGULO RETANGULO");
        } else if (A * A > B * B + C * C) {
            System.out.println("TRIANGULO OBTUSANGULO");
        } else if (A * A < B * B + C * C) {
            System.out.println("TRIANGULO ACUTANGULO");
        } else if ((A == B) && (B == C)) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if ((A == B) || (B == C)) {
            System.out.println("TRIANGULO ISOSCELES");
        }

    }

}
