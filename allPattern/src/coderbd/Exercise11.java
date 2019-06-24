package coderbd;

import java.util.Arrays;

public class Exercise11 {
    public static void main(String[] args) {

        int[] array = {2000, 2001, 2002, 2003, 2004,
            2005, 2006, 2007, 2008, 2010, 2009,2011
        };

        System.out.println("Original array : " + Arrays.toString(array));
        
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]  = temp;
            
        }
        System.out.println("Reverse array : "+Arrays.toString(array));
    }
}
