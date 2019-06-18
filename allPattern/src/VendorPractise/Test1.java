
package VendorPractise;

public class Test1 {
    
    static int count = 0;
    int i = 0;
    
    public void changeCount(){
        while (i < 12) {            
            i++;
            count++;
        }
    }
    
    public static void main(String[] args) {
        
        Test1 t = new Test1();
        Test1 t1 = new Test1();
        t.changeCount();
        t1.changeCount();
        
        System.out.println(t.count + ": " + t1.count);
        
    }
}
