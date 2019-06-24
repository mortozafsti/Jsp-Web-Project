
package coderbd;

import java.util.Arrays;

public class Exercise10 {
    
    static int high;
    static int low;
    
    public static void high_low(int[] array){
        
        high = array[0];
        low = array[0];
        int len = array.length;
        
        for (int i = 1; i < len -1; i += 2) {
            
            if (i+1 > len) {
                if (array[i] > high) {
                    high = array[i];
                }
                if (array[i] < low) {
                    low = array[i];
                }
            }
            
            if (array[i] > array[i+1]) {
                if (array[i] > high) {
                    high = array[i];
                }
                if (array[i+1] < low) {
                    low = array[i+1];
                }
            }
            
            if (array[i] < array[i+1]) {
                if (array[i] < low) {
                    low = array[i];
                }
                if (array[i+1] > high) {
                    high = array[i+1];
                }
            }
        }
        
    }
    
    public static void main(String[] args) {
        
        int[] arr = {23,78,90,12,56,78,80,50,60};
        
        high_low(arr);
        
        System.out.println(" Original Array: "+Arrays.toString(arr));
        System.out.println(" Maximum value for the above array = " + high);
        System.out.println(" Minimum value for the above array = " + low);
    }
    
}
