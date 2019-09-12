
package javaCertification;

public class Vehicles {
    
    int x;

    public Vehicles() {
        this(10); // n1
    }

    public Vehicles(int x) {
        this.x = x;
    }
}
class Cars extends Vehicles{
    int y;

    public Cars() {
        super();
        //this(20);     //n2
    }

    public Cars(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return super.x + " " + this.y;
    }
    public static void main(String[] args) {
        Vehicles y = new Cars();
        System.out.println(y);
    }
}