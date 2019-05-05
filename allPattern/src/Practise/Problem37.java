package Practise;

import java.util.Scanner;

public class Problem37 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float A = scan.nextFloat();
       
        if (A < 0 || A > 100) {
            System.out.println("Fora de intervalo");
        }else{
            if(A >= 0 && A <= 25) {
                System.out.println("Intervalo [0,25]");
            }else if(A > 25 && A <= 50){
                System.out.println("Intervalo (25,50]");
            }else if(A > 50 && A <= 75){ 
                System.out.println("Intervalo (50,75]");
            }else{ 
                System.out.println("Intervalo (75,100]");
            }
        }
    }
}
//        double R1 = (-B+(Math.sqrt(D)))/(2*A);
//        double R2 = (-B-(Math.sqrt(D)))/(2*A);