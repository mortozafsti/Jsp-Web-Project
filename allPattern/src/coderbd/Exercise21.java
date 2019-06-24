
package coderbd;

import java.util.ArrayList;

public class Exercise21 {
    
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<String>();
        list.add("Bangladesh");
        list.add("Japan");
        list.add("Afganistan");
        list.add("Srilanka");
        list.add("South Africa");
        list.add("Australia");
        list.add("India");
        list.add("Pakistan");
        
        String[] array = new String[list.size()];
        list.toArray(array);
        
        for (String i : array) {
            System.out.println(i);
        }
    }
}
