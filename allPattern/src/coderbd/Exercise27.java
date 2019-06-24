
package coderbd;

import java.util.Arrays;

public class Exercise27 {
    
    public static void main(String[] args) {
        
        int[] array_nums = {3, 8, 9, 10, 12,13,7};
        System.out.println("Original Array: "+Arrays.toString(array_nums));
        
        int count = 0;
        for (int i = 0; i < array_nums.length; i++) {
            if (array_nums[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Number of Even Numbers: "+ count);
        System.out.println("Number of Odd Numbers: "+ (array_nums.length-count));
        
    }
    
}
