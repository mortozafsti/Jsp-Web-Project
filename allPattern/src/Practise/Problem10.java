
package Practise;

import java.util.Scanner;

public class Problem10 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
         int pcode1 = scan.nextInt();
         int punit1 = scan.nextInt();
         float price1 = scan.nextFloat();
         
         int pcode2 = scan.nextInt();
         int punit2 = scan.nextInt();
         float price2 = scan.nextFloat();
         
         float ptotal = punit1 * price1;
         float ptota2 = punit2 * price2;
         
         float totalPay = ptotal + ptota2;
        
       System.out.printf("VALOR A PAGAR: R$ %.2f\n",totalPay);
       
    }
}
