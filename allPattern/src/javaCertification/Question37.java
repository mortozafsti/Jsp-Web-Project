
package javaCertification;

public class Question37 {
    
    static boolean isAvailable = false;
    
    public static boolean doStuff(){
        return !isAvailable;
    }
    
    public static void main(String[] args) {
        
        Question37 q = new Question37();
        System.out.println(isAvailable + " ");
        isAvailable = q.doStuff();
        System.out.println(isAvailable);
        
    }
    
}
