
package Practise;

import java.util.Scanner;

public class Problem9 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String name = scan.nextLine();
        double fixedSalary = scan.nextDouble();
        double totalSale = scan.nextDouble();
        
        double totalsalary  = fixedSalary + (totalSale * 15) / 100;
        
        System.out.printf("TOTAL = R$ %.2f\n",totalsalary);
       
    }
}
