package Practise;

import java.util.Scanner;

public class ExPractice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();

        if ( A % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Not Even");
        }
    }
}
//C % 2 == 0 && D % 2 == 0