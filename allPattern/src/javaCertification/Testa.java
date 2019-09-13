
package javaCertification;

public class Testa {
    
    static int count = 0;
    int i = 0;
    
    public void changeCount(){
        while (i<5) {            
            i++;
            count++;
        }
    }
    public static void main(String[] args) {
        
        Testa t = new Testa();
        Testa t1 = new Testa();
        
        t.changeCount();
        t1.changeCount();
        
        System.out.println(t.count + " " + t1.count);
        
    }
}
