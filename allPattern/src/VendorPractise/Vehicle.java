
package VendorPractise;

public class Vehicle {
    
    String type = "4W";
    int maxSpeed = 100;

    public Vehicle(String type,int maxSpeed) {
        this.type=type;
        this.maxSpeed=maxSpeed;
    }

    
}
class Car extends Vehicle{
    
    String trans;
    

     Car(String trans, String type, int maxSpeed) {
        super(type, maxSpeed);
        this.trans = trans;
    }

    
    
    
}
