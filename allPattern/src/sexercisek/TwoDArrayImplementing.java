
package sexercisek;

import java.util.Scanner;

public class TwoDArrayImplementing {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int[][] arr = new int[n][n];
        
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = scan.nextInt();
                if (i % 2 == 0 && j == 0) {
                    arr[i][j] = 1;
                }else{
                   arr[i][j] = 0; 
                }
            }
        }
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();    
        }
        
    }
}
