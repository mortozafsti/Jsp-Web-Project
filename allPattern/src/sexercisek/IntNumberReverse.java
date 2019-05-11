package sexercisek;

import java.util.Scanner;

public class IntNumberReverse {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int n1 = s.nextInt();
        int sum = 0;
        while (n > 0) {
            sum = sum * 10 + n % 10;
            n = n / 10;
        }
        System.out.println("This is Main Method Result "+sum);
        int d = ReverseIntNum(n1);
        System.out.println("This is Method Result D:- "+d);
    }

   static int ReverseIntNum(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum * 10 + n % 10;
            n = n / 10;

        }
        return sum;
    }
}
