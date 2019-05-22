
package sexercisek;

import java.util.Scanner;

public class TwoDArrayCounting {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int[][] arr = new int[n][n];
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
                if (arr[i][j] == 0) {
                    count1++;
                }
                if (arr[i][j] == 1) {
                    count2++;
                }
            }
        }
        System.out.println("Count 0 is "+ count1);
        System.out.println("Count 1 is "+ count2);
        System.out.println("Count 1 is "+ (n*n-(count1+count2)));
    }
}
