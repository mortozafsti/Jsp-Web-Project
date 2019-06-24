
package coderbd;

import java.util.Arrays;

public class Exercise28 {
    
    public static void main(String[] args) {
        
        int[] array_nums = {5, 6, 11, 2 ,8};
        System.out.println("Original Arrays: "+Arrays.toString(array_nums));
        
        int max_val = array_nums[0];
        int min_val = array_nums[0];
        
        for (int i = 1; i < array_nums.length; i++) {
            if (array_nums[i] > max_val) {
                max_val = array_nums[i];
            }else if(array_nums[i] < min_val){
                min_val = array_nums[i];
            }
        }
        System.out.println("Difference between the largest and smallest values of the array: "+ (max_val-min_val));
    }
    
}
