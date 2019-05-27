
package Practise;

import java.util.Scanner;

public class Problem1079 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        float result;
        
        for (int i = 1; i <= N; i++) {
            
            float X1 = scan.nextFloat();
            float X2 = scan.nextFloat();
            float X3 = scan.nextFloat();
            
            result = ((X1*2)+(X2*3)+(X3*5)) / 10;
            
            System.out.printf("%.1f\n",result);
        }
        
    }
}
