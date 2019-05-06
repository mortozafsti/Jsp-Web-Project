package Practise;

import java.util.Scanner;

public class Problem38 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int X = scan.nextInt();
        int Y = scan.nextInt();
        
        if (X == 1) {
            System.out.printf("Total: R$ %.2f\n",(Y*4.00));
        }else if(X == 2){
            System.out.printf("Total: R$ %.2f\n",(Y*4.50));
        }else if(X == 3){
            System.out.printf("Total: R$ %.2f\n",(Y*5.00));
        }else if(X == 4){
            System.out.printf("Total: R$ %.2f\n",(Y*2.00));
        }else if(X == 5){
            System.out.printf("Total: R$ %.2f\n",(Y*1.50));
        }
    }
}
//        double R1 = (-B+(Math.sqrt(D)))/(2*A);
//        double R2 = (-B-(Math.sqrt(D)))/(2*A);