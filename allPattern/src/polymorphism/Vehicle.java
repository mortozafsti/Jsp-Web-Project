package polymorphism;

public class Vehicle {

    public int whiles = 5;
    public int whileqs = 3;
    public void runEngine() {
        System.out.println("All vehicles has a engine.");
    }
}

class Bike extends Vehicle {

    public int whiles = 2;

    public void runBike() {
        System.out.println("Bike Running");
    }
}

class Car extends Vehicle {

    public int whiles = 4;

    public void runCar() {
        System.out.println("Car Running");
    }
}

class Teste {

    public static void main(String[] args) {
        Bike b = new Bike();
        int s = b.whiles;
        int s1 = b.whileqs;
        b.runBike();
        System.out.println(s);
        System.out.println(s1);
    }
}
