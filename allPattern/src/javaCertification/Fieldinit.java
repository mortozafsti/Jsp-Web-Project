
package javaCertification;

public class Fieldinit {
    
    char c;
    boolean b;
    float f;
    
    void printAll(){
        System.out.println("C = " + c);
        System.out.println("B = " + b);
        System.out.println("F = " + f);
    }
    
    public static void main(String[] args) {
        
        Fieldinit f = new Fieldinit();
        f.printAll();
    }
    
}
