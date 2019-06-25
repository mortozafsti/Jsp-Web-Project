
package ocaAndocp;

import java.util.List;

public class Chicken {
    
}
interface HenHouse{
    List<Chicken> getChickens();
}
class ChickenSong{
    public static void main(String[] args) {
        HenHouse house = ________________;
        Chicken chicken = house.getChickens().get(0);
        for (int i = 0; i < house.getChickens().size(); chicken=house.getChickens().get(i++)) {
            System.out.println("Cluck");
        }
    }
}