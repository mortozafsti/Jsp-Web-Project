
package sexercisek;

import java.util.Scanner;

public class FindMax2 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 0;
        int x = 0;
        int po = 0;
        
        for (int i = 0; i < n; i++) {
            x = scan.nextInt();
            if (x > a) {
               a = x;
               po = i;
            }
        }
        System.out.println(a);
        System.out.println(++po);
        
    }
}
