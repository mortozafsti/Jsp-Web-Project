
package VendorPractise;

public class Car1 extends Vehiclee{
    int y;

    public Car1() {
        super();
        //this(20);
        
    }

    public Car1(int y) {
        this.y = y;
    }
    
    public String toString(){
        return super.x + " : " +this.y;
    }
}
