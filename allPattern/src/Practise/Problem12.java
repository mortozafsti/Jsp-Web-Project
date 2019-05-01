package Practise;

import java.util.Scanner;

public class Problem12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] integers = new double[3];
        for (int i = 0; i < 3; i++) {
            integers[i] = scan.nextDouble();
        }
        
        double pi = 3.14159d;

        double triangulo = (integers[0] * integers[2]) / 2;
        double circulo = pi * integers[2] * integers[2];
        double tarpezio = (integers[0] + integers[1])*integers[2] / 2;
        double quadrado = (integers[1] * integers[1]);
        double rectanglo = integers[0] * integers[1];

        System.out.printf("TRIANGULO: %.3f\n",triangulo);
        System.out.printf("CIRCULO: %.3f\n",circulo);
        System.out.printf("TRAPEZIO: %.3f\n",tarpezio);
        System.out.printf("QUADRADO: %.3f\n",quadrado);
        System.out.printf("RETANGULO: %.3f\n",rectanglo);

    }
}
