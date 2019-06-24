
package coderbd;

import java.util.Arrays;

public class Exercise7 {
    
    public static void main(String[] args) {
        
        int[] arr = {24,23,67,89,60,55,33,44,66};
        System.out.println("Original Array: "+Arrays.toString(arr));
        
        int rindex = 4;
        
        for (int i = rindex; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        System.out.println("After removing the second element: "+Arrays.toString(arr)); 
    }
    
}
