
package ocaAndocp;

public class Deer {

    public Deer() {
        System.out.println("Deer");
    }
    public Deer(int age) {
        System.out.println("DeerAge");
    }
    private boolean hasHours(){
        return false;
    }
    
    public static void main(String[] args) {
        Deer deer = new Reindeer(5);  
        System.out.println(deer.hasHours());
    }
}
class Reindeer extends Deer{

    public Reindeer(int age) {
        System.out.println("Reindeer");
    }
    public boolean hasHours(){
        return true;
    }
}
