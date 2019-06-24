
package coderbd;

import java.util.Arrays;

public class Exercise8 {
    
    public static void main(String[] args) {
        
        int[] arrayOne = {25,50,34,56,78,90};
        int[] arrayTwo = new int[7];
        
        System.out.println("Source Array: "+Arrays.toString(arrayOne));
        
        for (int i = 0; i < arrayOne.length; i++) {
            arrayTwo[i] = arrayOne[i];
        }
        System.out.println("New Array: "+Arrays.toString(arrayTwo));
        
    }
}
