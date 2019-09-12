
package javaCertification;

public class MarkList {
    
    int num;
    
    public static void graceMarks(MarkList mk){
        mk.num += 10;
    }
    
    public static void main(String[] args) {
        
        MarkList obj = new MarkList();
        MarkList obj1 = obj;
        MarkList obj2 = null;
        obj2.num = 60;
        graceMarks(obj2); 
        
    }
}
