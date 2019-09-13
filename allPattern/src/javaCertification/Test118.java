
package javaCertification;

public class Test118 {
    
    
    public static int stVar = 100;
    public int var = 200;

    
    public String toString() {
        return var + " " + stVar;
    }
    
    public static void main(String[] args) {
        
        Test118 t = new Test118();
        t.var = 300;
        System.out.println(t);
        Test118 t1 = new Test118();
        t1.stVar = 300;
        System.out.println(t1);
    }
    
    
}
