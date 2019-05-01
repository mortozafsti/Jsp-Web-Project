package Practise;

import java.util.Scanner;

public class Problem15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Double x1 = scan.nextDouble();
        Double y1 = scan.nextDouble();

        Double x2 = scan.nextDouble();
        Double y2 = scan.nextDouble();

        Double p1 = (x2 - x1) * (x2 - x1);
        Double p2 = (y2 - y1) * (y2 - y1);

        Double distance = Math.sqrt(p1 + p2);

        System.out.printf("%.4f\n",distance);

    }
}
