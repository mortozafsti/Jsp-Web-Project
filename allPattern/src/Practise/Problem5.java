
package Practise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float A = scan.nextFloat();
        float B = scan.nextFloat();
        
        float MEDIA = (float) (((A*3.5)+(B*7.5))/(3.5+7.5));
        
        //System.out.printf("MEDIA = %.5f\n",MEDIA);
        System.out.println("MEDIA = "+ new DecimalFormat("0.00000").format(MEDIA)); 
        
        
    }
}
