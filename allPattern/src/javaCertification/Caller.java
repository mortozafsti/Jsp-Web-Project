
package javaCertification;

public class Caller {
    
    private void init(){
        System.out.println("Inizialized");
    }
    
    private void start(){
        init();
        System.out.println("Started");
    }
}
class Testt{
    public static void main(String[] args) {
        Caller  c = new Caller();
//    c.start();
//    c.init();
    }
}
