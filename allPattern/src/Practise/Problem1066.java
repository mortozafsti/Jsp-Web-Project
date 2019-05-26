package Practise;

import java.util.Scanner;

public class Problem1066 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = 0;
        int evencount = 0;
        int oddcount = 0;
        int positive = 0;
        int negative = 0;

        for (int i = 1; i <= 5; i++) {
            number = scan.nextInt();
            if (number % 2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }

            if (number > 0) {
                positive += 1;
            } else if (number < 0) {
                negative += 1;
            }
        }

        System.out.println(evencount + " valor(es) par(es)");
        System.out.println(oddcount + " valor(es) impar(es)");
        System.out.println(positive + " valor(es) positivo(s)");
        System.out.println(negative + " valor(es) negativo(s)");
    }
}
