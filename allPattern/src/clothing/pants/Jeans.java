
package clothing.pants;

import static clothing.Shirt.getColor;

public class Jeans {
    
    public void matchShirt(){
        String color = getColor();
        if (color.equals("Green")) { 
            System.out.println("Fit");
        }
    }
    public static void main(String[] args) {
        Jeans t = new Jeans();
        t.matchShirt();
    }
}
