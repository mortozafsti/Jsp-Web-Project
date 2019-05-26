package Practise;

import java.util.Scanner;

public class Problem1067 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int X = scan.nextInt();
        
        for (int i = 1; i <= X; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
