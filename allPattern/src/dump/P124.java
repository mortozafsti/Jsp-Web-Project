
package dump;


public class P124 {
    private double length;
    private double height;
    private double area;

    public double setLength(double length) {
        this.length = length;
        setArea(area);
       return length;
    }

    public double setHeight(double height) {
        this.height = height;
        setArea(area);
        return height;
    }

    public double setArea(double area) {
        area = length * height;
        return area;
    }
    
    public static void main(String[] args) {
        P124 p124 = new P124();
        p124.length = 10;
        p124.height = 5;
        double ss = p124.setArea(20); 
        System.out.println(ss);
    }
}
