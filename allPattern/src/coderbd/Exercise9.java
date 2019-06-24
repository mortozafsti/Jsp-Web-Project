
package coderbd;

import java.util.Arrays;

public class Exercise9 {
    
    public static void main(String[] args) {
        
        int[] arrayOne = {25,50,34,56,78,90};
        
        int index_position = 3;
        int newValue = 100;
        
        System.out.println("Original Array: "+Arrays.toString(arrayOne));
        
        for (int i = arrayOne.length-1; i > index_position; i--) {
            arrayOne[i] = arrayOne[i-1];
        }
        arrayOne[index_position] = newValue;
        System.out.println("New Array: "+Arrays.toString(arrayOne));
        
    }
}
