
package dump;

public class Animal {
    String type = "Canine";
    int maxSpeed = 60;

    public Animal() {
    }
    public Animal(String type,int maxSpeed) {
        this.type = type;
        this.maxSpeed = this.maxSpeed;
    }
}
class WildAnimal extends Animal{ 
    String bounds;

    public WildAnimal(String bounds) {
        super();
        this.bounds = bounds;
    }

    public WildAnimal(String bounds,int maxSpeed, String type) {
        super(type, maxSpeed);
        this.bounds = bounds;
    }

    public static void main(String[] args) {
        WildAnimal wolf = new WildAnimal("Long");
        WildAnimal tiger = new WildAnimal("Feline",80,"short");
        System.out.println(wolf.type +" "+wolf.maxSpeed+" "+wolf.bounds);
        System.out.println(tiger.type +" "+tiger.maxSpeed+" "+tiger.bounds);
        
        StringBuilder sb = new StringBuilder("rakib");
        System.out.println(sb);
        sb.delete(0, sb.length());
        System.out.println("afsxsacx : "+sb);
        
        
        
        
    }
     
    
}