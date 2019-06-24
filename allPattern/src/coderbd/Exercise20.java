
package coderbd;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise20 {
    
    public static void main(String[] args) {
        
        String[] array = new String[]{"Milton","David","Harris",
            "Jon","Lukas","Lukaka"
        };
        
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));
        System.out.println(list);
        
    }
}
