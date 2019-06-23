
package coderbd;

import java.util.Arrays;

public class Exercise1 {
    
    public static void main(String[] args) {
        
        int[] array = {2000,2001,2002,2003,2004,
            2005,2006,2007,2008,2010,2009
        };
        
        String[] array2 = {
            "Milon","David","Jon","Mortoza",
            "Jerry","Tom","Mike","Harris",
            "Khan","Bikon","Malala"
        };
        
        System.out.println("Original numeric array : "+Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted numeric array : "+Arrays.toString(array));
        
        System.out.println("Original String array : "+Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted String array : "+Arrays.toString(array2));
        
    }
    
}
