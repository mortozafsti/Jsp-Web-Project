
package javaCertification;

public class Triangle {
    
    static double area;
    
    int b = 2,h = 3;
    
    public static void main(String[] args) {
        
        double p, b, h;
        
        if (area == 0) {
             b = 3;
             h = 4;
             p = 0.3;
             area = p * b * h;
        }
//        area = p * b * h;
        System.out.println("Area is " + area);
        
    }
}
