
package Practise;

import java.util.Scanner;

public class Problem1075 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        
        for (int i = 1; i < 10000; i++) {
            if (i % N == 2) {
                System.out.println(i);
            }
        }
    }
}
