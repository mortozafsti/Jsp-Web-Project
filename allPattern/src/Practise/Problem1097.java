
package Practise;

import java.io.IOException;

public class Problem1097 {
    
    public static void main(String[] args) throws IOException{
       
        for (int i = 1, j = 7; i <= 9; i +=2, j +=2) {
            for (int I = i,k = j; k >= (j-2); k--) {
                System.out.println("I="+i+" "+"J="+k);
            }
        }
        
    }
}
