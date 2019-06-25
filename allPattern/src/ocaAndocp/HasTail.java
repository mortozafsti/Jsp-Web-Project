
package ocaAndocp;

public interface HasTail {
    
    int getTailLength();
    
}
abstract class Puma implements HasTail{
    
   protected int getTailLength(){
        return 4;
    }
}
class Congure extends Puma{
    public static void main(String[] args) {
        Puma p = new Puma();
        System.out.println(p.getTailLength());
    }
    
    public int getTailLength(int length){
        return 2;
    }
}