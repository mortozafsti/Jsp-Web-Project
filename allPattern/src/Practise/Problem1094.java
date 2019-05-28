package Practise;

import java.util.Scanner;

public class Problem1094 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x;
        String ch;
        int frogs = 0;
        int rats = 0;
        int rabbits = 0;

        float frogsPercent = 0;
        float ratsPercent = 0;
        float rabbitsPercent = 0;

        int totalAnimal = 0;

        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {

            x = scan.nextInt();
            ch = scan.next();

            totalAnimal += x;

            if (ch.equals("C")) {
                rabbits += x;
            } else if (ch.equals("R")) {
                rats += x;
            } else if (ch.equals("S")) {
                frogs += x;
            }
            frogsPercent = (float) ((frogs * 100.00) / totalAnimal);
            rabbitsPercent = (float) ((rabbits * 100.00) / totalAnimal);
            ratsPercent = (float) ((rats * 100.00) / totalAnimal);

        }
//        System.out.println("Total: " +totalAnimal+ " cobaias");
//        System.out.println("Total de coelhos: "+rabbits);
//        System.out.println("Total de ratos: " +rats);
//        System.out.println("Total de sapos: " +frogs);
//
//        System.out.printf("Percentual de coelhos: %.2f", rabbitsPercent);
//        System.out.print(" %\n");
//        System.out.printf("Percentual de ratos: %.2f", ratsPercent);
//        System.out.print(" %\n");
//        System.out.printf("Percentual de sapos: %.2f", frogsPercent);
//        System.out.print(" %\n");

        System.out.print("Total: " + totalAnimal + " cobaias\n");
        System.out.print("Total de coelhos: " + rabbits + "\n");
        System.out.print("Total de ratos: " + rats + "\n");
        System.out.print("Total de sapos: " + frogs + "\n");

        System.out.printf("Percentual de coelhos: %.2f", rabbitsPercent);
        System.out.print(" %\n");
        System.out.printf("Percentual de ratos: %.2f", ratsPercent);
        System.out.print(" %\n");
        System.out.printf("Percentual de sapos: %.2f", frogsPercent);
        System.out.print(" %\n");
    }
}
