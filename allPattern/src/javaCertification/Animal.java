
package javaCertification;

public class Animal {
    
    String type = "Canine";
    int maxSpeed = 60;

    public Animal() {
    }
    
    public Animal(String type,int maxSpeed) {
         this.type = type;
         this.maxSpeed = maxSpeed;
    }   
}


class WildAnimal extends Animal{
    String bounds;

    public WildAnimal(String bounds) {
        super();
        
    }
    public WildAnimal(String type,int maxSpeed,String bounds) {
        super(type,maxSpeed);
        this.bounds = bounds;
    }
}
