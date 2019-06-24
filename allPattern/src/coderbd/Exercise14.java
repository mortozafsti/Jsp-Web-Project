
package coderbd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Exercise14 {
    
    public static void main(String[] args) {
        
        String[] arrayOne = {"Teacher","Madam","Geardian","Student","Parents",};
        String[] arrayTwo = {"David","Milton","Madam","Jon","Viki","Rakib","student","Backham",};
        
        System.out.println("Array One: "+Arrays.toString(arrayOne));
        System.out.println("Array Two: "+Arrays.toString(arrayTwo));
        
        // We Can Use both ArrayList and HashSet;
        ArrayList<String> commonElement = new ArrayList<>();
        
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                // We Can Use both equals and equalsIgnoreCase;
                if (arrayOne[i].equalsIgnoreCase(arrayTwo[j])) {
                    commonElement.add(arrayOne[i]);
                }
            }
        }
        System.out.println("Common Element: "+(commonElement));
        
    }
    
}
