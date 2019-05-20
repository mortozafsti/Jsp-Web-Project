
package Practise;

import java.util.Scanner;

public class Problem1051 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        float salary = scan.nextFloat();
        
        if (salary >= 0.00 && salary <= 2000.00) {
            System.out.println("Isento");
        }else if(salary >= 2000.01 && salary <= 3000.00){ 
            System.out.printf("R$ %.2f\n",((salary-2000.00)*8)/100);
        }else if(salary >= 3000.01 && salary <= 4500.00){ 
            System.out.printf("R$ %.2f\n",((salary-3000.00)*18/100) + ((1000.00*8)/100));
        }else if(salary > 4500.00){ 
            System.out.printf("R$ %.2f\n",((salary-4500.00)*28/100) + ((1500.00*18) / 100) + ((1000.00*8) / 100));
        }
    }
}
