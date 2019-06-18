
package VendorPractise;

public class Vioul {
    
    private char var;
    public static void main(String[] args) {
        
        char var1 = 'a';
        char var2 = var1;
        var2 = 'e';
        
        Vioul obj1 = new Vioul();
        Vioul obj2 = obj1;
        obj1.var = 'i';
        obj2.var = '0';
        System.out.println(var1+ ", " +var2);
        System.out.println(obj1.var+ ", " +obj2.var);
        
    }
}
