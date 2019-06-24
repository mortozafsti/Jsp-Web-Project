
package coderbd;

import java.util.Arrays;

public class Exercise29 {
    
    public static void main(String[] args) {
        
        int array[] = {6, 9, 12, 15, 4, 2};
        System.out.println("Original Array: "+Arrays.toString(array));
        
        int max_val = array[0];
        int min_val = array[0];
        float sum = array[0];
        
        for (int i = 1; i < array.length; i++) {
            
            sum += array[i];
            if (array[i] > max_val) {
                max_val = array[i];
            }else if(array[i] < min_val){
                min_val = array[i];
            }
        }
        float result = ((sum-max_val-min_val) / (array.length-2));
        System.out.println("The average is: "+result);
    }
}
