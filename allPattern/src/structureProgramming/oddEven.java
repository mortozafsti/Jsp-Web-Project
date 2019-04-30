package structureProgramming;

import java.util.Scanner;

public class oddEven {
   // int s = 0;
    static int sum(int n) {
        if (n == 0) {
            return 0;
        } else {
            System.out.println(n);
            return sum(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        sum(n);
    }
}
