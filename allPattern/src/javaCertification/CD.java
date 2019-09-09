
package javaCertification;

public class CD {
    
    int r;

    public CD(int r) {
        this.r = r;
    }
}
class DVD extends CD{
    
    int c;

    public DVD(int c, int r) {
        super(r);
        this.r = r;
    }
    
    public static void main(String[] args) {
        
        DVD d1 = new DVD(10, 20);
        System.out.println(d1.toString());
    }
    
}
