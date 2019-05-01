package Practise;

import java.util.Scanner;

public class Problem12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] integers = new double[3];
        for (int i = 0; i < 3; i++) {
            integers[i] = scan.nextDouble();
        }
//        
//        float A = scan.nextInt();
//        float B = scan.nextInt();
//        float C = scan.nextInt();

        double pi = 3.14159;

        double TRIANGULO = (integers[0] * integers[2]) / 2;
        double CIRCULO = pi * integers[1] * integers[1];
        double TRAPEZIO = (integers[0] + integers[1])*integers[2] / 2;
        double QUADRADO = (integers[1] * integers[1]);
        double RETANGULO = integers[0] * integers[1];

        System.out.printf("TRIANGULO: = %.3f\n",TRIANGULO);
        System.out.printf("CIRCULO: = %.3f\n",CIRCULO);
        System.out.printf("TRAPEZIO: = %.3f\n",TRAPEZIO);
        System.out.printf("QUADRADO: = %.3f\n",QUADRADO);
        System.out.printf("RETANGULO: = %.3f\n",RETANGULO);

    }
}
