
package Practise;

import java.util.Scanner;

public class Problem1065 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int number = 0;
        int count = 0;
        
        for (int i = 1; i <= 5; i++) {
            number = scan.nextInt();
            if (number % i == 0) {
                count += 1;
            }
        }
        System.out.println(count+" valores pares");  
    }
}
