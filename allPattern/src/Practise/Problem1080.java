
package Practise;

import java.util.Scanner;

public class Problem1080 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        
        Problem1080 problem1080 = new  Problem1080();
        problem1080.findMax(N);
                
        
    }
    
    public int findMax(int n){
        int max = 0;
        int min = 0;
        if (n > max) {
            max = n;
        }
        if (n < min) {
            min = n;
        }
        return max;
    }
}
