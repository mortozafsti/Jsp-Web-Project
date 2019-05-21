
package Practise;

import java.util.Scanner;

public class Problem1060 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double number = 0;
        int count = 0;
        
        for (int i = 0; i < 6; i++) {
            number = scan.nextDouble();
            if (number > 0) {
                count += 1;
            }
        }
        System.out.println(count+" valores positivos");  
    }
}
