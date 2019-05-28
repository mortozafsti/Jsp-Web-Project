
package Practise;

import java.io.IOException;

public class Problem1095 {
    
    public static void main(String[] args) throws IOException{
        
        for (int I = 1, J = 60; J >= 0; I += 3, J -= 5) {
            System.out.println("I=" + I + " J=" + J);
        }
        
    }
}
