
package javaCertification;

public class Question131 {
    
    
    int a1;
    
    public static void doProduct(int a){
        a = a * a;
        
    } 
    public static void doSring(StringBuilder s){
        s.append(" " + s);
        
    }
    
    public static void main(String[] args) {
        
        Question131 t = new Question131();
        t.a1 = 11;
        
        StringBuilder sb = new StringBuilder("Hello");
        Integer i = 10;
        doProduct(i);
        doSring(sb);
        doProduct(t.a1);
        
        
        System.out.println(i + " " + sb + " " + t.a1);
        
    }
}
