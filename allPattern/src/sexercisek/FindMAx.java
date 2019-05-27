
package sexercisek;

import java.util.Scanner;

public class FindMAx {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        
        int maxR = arr[0];
        int po = 0;
        
        for (int i = 1; i < n; i++) {
            if (arr[i] > maxR) {
                maxR = arr[i];
                po = i;
            }
        }
        System.out.println(maxR);
        System.out.println(++po);
    }
}
