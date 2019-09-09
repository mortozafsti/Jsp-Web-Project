package javaCertification;

public class Car extends Vehicle {

    String trains = "ssssssssssss";

    public Car(String trains, String type, int maxSpeed) {
        super(type, maxSpeed);
        this.trains = trains;
    }

//    Car(String trains) {
//        this.trains = trains;
//    }
    Car(String type, int maxSpeed, String trains) {
        super(type, maxSpeed);

    }

    public static void main(String[] args) {

        // Car c1 = new Car();
        Car c2 = new Car("Auto", 150, "MAnnual");

//        System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trains);
        System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trains);

    }

}
