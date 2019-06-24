
package coderbd;

import java.util.Arrays;

public class Exercise17 {
    
    public static void main(String[] args) {
        
        int[] array = {233,400,350,200,100,120,250};
        
        System.out.println("Original Array: "+Arrays.toString(array));
        Arrays.sort(array);
        //System.out.println(" "+Arrays.toString(array));
        int position = array.length-1;
        //System.out.println(position);
        while (array[position] == array[array.length-1]) {            
             position--;
        }
        
        System.out.println("Second Largest Value: "+array[position]);
        
    }
    
}
