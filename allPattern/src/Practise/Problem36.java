package Practise;

import java.util.Scanner;

public class Problem36 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float A = scan.nextFloat();
        float B = scan.nextFloat();
        float C = scan.nextFloat();
        
        float D = (B*B) - (4*A*C);
        float R1 = (float) (-B+Math.sqrt(D)) / (2*A);
        float R2 = (float) (-B-Math.sqrt(D)) / (2*A);
       
       if(A!=0 && D>0){ 
           System.out.printf("R1 = %.5f\n",R1);
           System.out.printf("R2 = %.5f\n",R2);
       }else{
           System.out.printf("Impossivel calcular\n");
       }

    }
}
//        double R1 = (-B+(Math.sqrt(D)))/(2*A);
//        double R2 = (-B-(Math.sqrt(D)))/(2*A);