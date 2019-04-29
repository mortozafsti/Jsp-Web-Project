package Practise;

import java.util.Scanner;

public class Problem12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double B;
        double C;

        double A = B = C = scan.nextFloat();

        double pi = 3.14159;

        double TRIANGULO = (A * C) / 2;
        double CIRCULO = pi * C * C;
        double TRAPEZIO = (A * C) / 2;
        double QUADRADO = (A * C) / 2;
        double RETANGULO = A * B;

        System.out.printf("TRIANGULO: = %.3f\n", TRIANGULO);
        System.out.printf("CIRCULO: = %.3f\n", CIRCULO);
        System.out.printf("TRAPEZIO: = %.3f\n", TRAPEZIO);
        System.out.printf("QUADRADO: = %.3f\n", QUADRADO);
        System.out.printf("RETANGULO: = %.3f\n", RETANGULO);

    }
}
