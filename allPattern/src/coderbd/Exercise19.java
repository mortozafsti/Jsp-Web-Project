
package coderbd;

import java.util.Scanner;

public class Exercise19 {
    
    public static void main(String[] args) {
        
        int m,n,c,d;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input number of rows of matrix");
        m = scan.nextInt();
        System.out.println("Input number of column of matrix");
        n = scan.nextInt();
        
        int array1[][] = new int[m][n];
        int array2[][] = new int[m][n];
        int sum[][] = new int[m][n];
        
        System.out.println("Input the first matrix");
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++) {
                array1[c][d] = scan.nextInt();
            }
        }
        
        System.out.println("Input the second matrix");
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++) {
                array2[c][d] = scan.nextInt();
            }
        }
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++) {
                sum[c][d] = array1[c][d] + array2[c][d];
            }
        }
        
        System.out.println("Sum of the matrices:-");
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++) {
                System.out.print(sum[c][d]+"\t");
                
            }System.out.println();
        }

    }
    
}
