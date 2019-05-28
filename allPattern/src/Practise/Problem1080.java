package Practise;

import java.util.Scanner;

public class Problem1080 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = 100;
        int x;
        int max = 0;
        int pos = 0;

        for (int i = 1; i <= n; i++) {
            x = scan.nextInt();
            if (x > max) {
                max = x;
                pos = i;
            }

        }
        System.out.println(max);
        System.out.println(pos);
    }
}
