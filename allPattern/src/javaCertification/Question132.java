
package javaCertification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question132 {
    
    
    public static void main(String[] args) {
        
        String[] arr = {"Hi","How","Are","You"};
        List<String> arrlist = new ArrayList<>(Arrays.asList(arr));
        
        if (arrlist.removeIf((String r) -> (return r.length() <= 2;))) {
            System.out.println(r+ "removed");
        }
    }
}
