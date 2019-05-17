
package Practise;

import java.util.Scanner;

public class Problem1048 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        float salary = scan.nextFloat();
        
        if (salary > 0 && salary <= 400.00) {
            float  earned = salary * 15 / 100;
            System.out.printf("Novo salario: %.2f\n",(salary + earned));
            System.out.printf("Reajuste ganho: %.2f\n",earned);
            System.out.println("Em percentual: 15 %");
        }else if(salary > 400.01 && salary <= 800.00){ 
            float  earned = salary * 12 / 100;
            System.out.printf("Novo salario: %.2f\n",(salary + earned));
            System.out.printf("Reajuste ganho: %.2f\n",earned);
            System.out.println("Em percentual: 12 %");
        }else if(salary > 800.01 && salary <= 1200.00){ 
            float  earned = salary * 10 / 100;
            System.out.printf("Novo salario: %.2f\n",(salary + earned));
            System.out.printf("Reajuste ganho: %.2f\n",earned);
            System.out.println("Em percentual: 10 %");
        }else if(salary > 1200.01 && salary <= 2000.00){ 
            float  earned = salary * 7 / 100;
            System.out.printf("Novo salario: %.2f\n",(salary + earned));
            System.out.printf("Reajuste ganho: %.2f\n",earned);
            System.out.println("Em percentual: 7 %");
        }else if(salary > 2000.01){ 
            float  earned = salary * 4 / 100;
            System.out.printf("Novo salario: %.2f\n",(salary + earned));
            System.out.printf("Reajuste ganho: %.2f\n",earned);
            System.out.println("Em percentual: 4 %");
        }
    }
}
