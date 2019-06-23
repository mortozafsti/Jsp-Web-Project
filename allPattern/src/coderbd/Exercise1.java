
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
        
    }
    
}
