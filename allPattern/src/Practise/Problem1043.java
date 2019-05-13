
package Practise;

import java.util.Scanner;

public class Problem1043 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        float A = scan.nextFloat();
        float B = scan.nextFloat();
        float C = scan.nextFloat();
        
        if (A < B+C && B < A+C && C < A+B) {
            System.out.printf("Perimetro = %.1f\n",A+B+C);
        }else{ 
            System.out.printf("Area = %.1f\n",C*(A+B)/2);
        }     
    }
}
