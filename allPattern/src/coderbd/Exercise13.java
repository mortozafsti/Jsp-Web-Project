
package coderbd;

public class Exercise13 {
    
    public static void main(String[] args) {
        
        String[] array = { "mom","madam","teacher","madam","student"
                ,"parents","child","guardian","class","room","mom"
        };
        
        for (int i = 0; i < array.length-1; i++) {
            
            for (int j = i+1; j < array.length; j++) {
                
                if ((array[i].equals(array[j])) && (i != j)) {
                    
                    System.out.println("Duplicate Element is: "+array[j]);
                    
                }
            }
        }
    }
}
