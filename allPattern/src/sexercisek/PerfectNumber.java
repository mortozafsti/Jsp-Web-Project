
package sexercisek;

import java.util.Scanner;

public class PerfectNumber {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int sum = 1;
        int count = 0;
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            count += 1;
        }else{ 
             System.out.println(n+" is Not Perfect Number");
        }
        System.out.println("Hou Many Perfect Number: "+count);
    }
}
