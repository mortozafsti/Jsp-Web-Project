
package coderbd;

import java.util.Arrays;

public class Exercise15 {
    
    public static void main(String[] args) {
        
        int[] arrayOne = {1,2,3,4,5,6,6,7};
        int[] arrayTwo = {11,12,13,5,15,16,17,18,3};
        
        System.out.println("Array One: "+Arrays.toString(arrayOne));
        System.out.println("Array Two: "+Arrays.toString(arrayTwo));
        
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                if ((arrayOne[i] == arrayTwo[j])) {
                    
                    System.out.println("Common Element is: "+arrayOne[i]);
                }
            }
        }
    }
    
}
