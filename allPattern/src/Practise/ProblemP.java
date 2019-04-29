package Practise;

import java.util.Scanner;

public class ProblemP {

//    double A, B, C;
    static double pi = 3.14159;

    public static double Circle(double C) {
        return pi * C * C;
    }
    public static double Triangle(double A, double C) {
        return A * C / 2;
    }
    public static double Rectangle(double A, double B) {
        return A * B;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();
        
        double TRIANGULO = Triangle(A,C);
        double CIRCULO = Circle(C);
        double RETANGULO = Rectangle(A,B);
        
        System.out.printf("TRIANGULO = %.3f\n", TRIANGULO);
        System.out.printf("CIRCULO = %.3f\n", CIRCULO);
        System.out.printf("RETANGULO = %.3f\n", RETANGULO);

    }
}
