
package sexercisek;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayImpl {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            arr[i] = x;
            arr1[i] = x;
        }
        Arrays.sort(arr); 
        //System.out.println(arr);
        
        for (int i = 0; i < n; i++) {
        
            System.out.println(arr[i]);
        }
        System.out.println();
        for(int i = 0; i<n; i++ ){
            System.out.println(arr1[i]);
           
        }
    }
}
