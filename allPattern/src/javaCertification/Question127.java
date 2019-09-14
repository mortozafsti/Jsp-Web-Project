
package javaCertification;

import java.util.ArrayList;
import java.util.List;

public class Question127 {
    
    public static void main(String[] args) {
        
        List color = new ArrayList();
        color.add("green");
        color.add("red");
        color.add("blue");
        color.add("yellow");
        color.remove(2);
        color.add(3, "cyan");
        
        System.out.println(color);
        
    }
}
