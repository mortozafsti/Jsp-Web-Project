
package Practise;

import java.util.Scanner;

public class Problem6 {
 // static float A, B, MEDIA;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float A = scan.nextFloat();
        float B = scan.nextFloat();
        float C = scan.nextFloat();
        
        float MEDIA = (float) (((A*2)+(B*3)+(C*5)) / (2+3+5));
        
        System.out.printf("MEDIA = %.1f\n",MEDIA);
       
        
        
    }
}
