
package ocaAndocp;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.AmbientLight;

public interface CanSwim {
    
    
}
class Amphibian implements CanSwim{
    
}
class Tadpole extends Amphibian{
    
}
class FindAllTadPole{
    public static void main(String[] args) {
        
        List<Tadpole> tap = new ArrayList<Tadpole>();
        
        for (Amphibian amphibian : tap) {
            Amphibian tapdole = amphibian;
        }
        
    }
}