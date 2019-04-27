package lightoj;

import java.util.Scanner;

 class Problem1 {

   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of loops : \n");
        int n = in.nextInt();
        int a, b;

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter number of problems in a computer : \n");
            a = in.nextInt();
            System.out.println("Enter number of problems in a computer : \n");
            b = in.nextInt();
            for (int j = 1; j <= n; j++) {
                if (j == 1) {
                    System.out.println("Case " + i + " : " + (a + b));
                    break;
                } else {
                    System.out.println("Case : " + i + " : " + (a + b));
                }
            }
        }

    }
}
