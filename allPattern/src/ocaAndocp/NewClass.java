package ocaAndocp;

import java.util.ArrayList;
import java.util.List;

public class NewClass {

    public static void main(String[] args) {

//        String[] names = new String[3];
//        
//        names[0] = "Lisa";
//        names[1] = "Kevin";
//        names[2] = "Rogar";
//        
//        for (String name : names) {
//            System.out.println(name);
//        }
        List<String> name = new ArrayList<String>();
        name.add("Lisa");
        name.add("Kevin");
        name.add("Rogar");
//        for (String value : name) {
//            System.out.println(value);
//        }
        
        for (int i = 0; i < name.size(); i++) {
            String nam = name.get(i);
            
            if (i>0) {
                System.out.println(", ");
            }
                System.out.println(nam);
            
        }
        
        int[] values = new int[3];
        values[0] = 10;
        values[1] = new Integer(5);
        values[2] = 15;
        
        for (int i = 1; i < values.length; i++) {
            System.out.println(values[i]-values[i-1]);
        }
    }

}
