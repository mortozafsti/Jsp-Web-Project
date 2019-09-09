
package sexercisek;

import java.util.Arrays;
import java.util.Scanner;

public  class  ArrayImpl {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] arr = new int[3];
        int[] arr1 = new int[3];
        for (int i = 0; i < 3; i++) {
            int x = scan.nextInt();
            arr[i] = x;
            arr1[i] = x;
        }
        Arrays.sort(arr); 
        
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        for(int i = 0; i<3; i++ ){
            System.out.println(arr1[i]);
           
        }
    }
}
