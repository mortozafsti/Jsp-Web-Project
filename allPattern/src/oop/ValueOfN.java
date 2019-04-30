package oop;

import java.util.Scanner;

public class ValueOfN {

    static int recursiveOdd(int n) {
        if (n == 0) {
            return 0;
        } else {
            System.out.print(n + " ");
            recursiveOdd(n-1);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        recursiveOdd(10);
    }
}
