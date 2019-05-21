
package Practise;

import java.util.Scanner;

public class Problem1064 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float number = 0;
        int count = 0;
        float sum = 0;
        
        for (int i = 0; i < 6; i++) {
            number = scan.nextFloat();
            if (number > 0) {
                count += 1;
                sum += number;
            }
        }
        System.out.println(count+" valores positivos");  
        System.out.printf("%.1f\n",sum/count);  
    }
}
