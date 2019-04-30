package oop;

import java.util.Scanner;

public class NewClass {

    static int sum(int n) {

        if (n % 2 == 0) {
            return n;
        } else {
            return n+1;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        sum(n);
       
        
    }
}
