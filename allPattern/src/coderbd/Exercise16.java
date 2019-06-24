
package coderbd;

import java.util.Arrays;

public class Exercise16 {
    
    public static void main(String[] args) {
        
        int[] array1 = {23,26,50,29,32,35,38,41,44,47,50};
        int[] array2 = {3,4,5,7,9,8,9,41,10,70,20};
        remove_duplicateValue(array1);
        remove_duplicateValue(array2);
        
    }
    
    static void remove_duplicateValue(int[] arr){
         
        System.out.println("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        
        int noUniqueElement = arr.length;
        
        for (int i = 0; i < noUniqueElement; i++) {
            for (int j = i+1; j < noUniqueElement; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = arr[noUniqueElement -1];
                    noUniqueElement--;
                    j--;
                }
            }
        }
        
        int[] arrayOne = Arrays.copyOf(arr, noUniqueElement);
        System.out.println();
        System.out.println("Arrays With Unique Element: ");
        
        for (int i = 0; i < arrayOne.length; i++) {
            System.out.print(arrayOne[i]+"\t");
        }
        System.out.println();
         System.out.println("---------------------------------------------------------------------------------");
    }
}
