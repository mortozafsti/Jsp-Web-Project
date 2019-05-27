package Practise;

import java.util.Scanner;

public class Problem1072 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int inCount = 0;
        int outCount = 0;

        int intervalStart = 10;
        int intervalEnd = 20;

        for (int i = 1; i <= N; i++) {
            int X = scan.nextInt();
            if (X >= intervalStart && X <= intervalEnd) {
                inCount += 1;
            } else {
                outCount += 1;
            }
        }

        System.out.println(inCount+" in");
        System.out.println(outCount+" out");

    }
}
