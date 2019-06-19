
package polymorphism;

public class TestInheritance {
    
    public static void testPolymorphism(Vehicle vehicle){
        vehicle.runEngine();
    }
    
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();
        
        testPolymorphism(c); 
        testPolymorphism(b);
        
        c.runCar();
        c.runEngine();
        b.runBike();
    }
}
