
package Practise;

import java.util.Scanner;

public class Problem9 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int employeeNumber = scan.nextInt();
        int workingHour = scan.nextInt();
        float amountPerHour = scan.nextFloat();
        
        float salary  = workingHour * amountPerHour;
        
        System.out.println("NUMBER = "+employeeNumber);
        System.out.printf("SALARY = U$ %.2f\n",salary);
       
    }
}
