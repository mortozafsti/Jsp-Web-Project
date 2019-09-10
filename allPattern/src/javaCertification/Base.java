
package javaCertification;

public class Base {
    
    public void test(){
        System.out.println("Base ");
    }
    
}

class DerivedA extends Base{
    
    public void test(){
        System.out.println("Derived A ");
    }
    
}
class DrivedB extends DerivedA{
    
    public void test(){
        System.out.println("Derived B ");
    }
    
    public static void main(String[] args) {
        
        Base b1 = new DrivedB();
        Base b2 = new DerivedA();
        Base b3 = new DrivedB();
        
        b1 =(Base) b3;
        
        Base b4 = (DerivedA) b3;
        
        b1.test();
        b4.test();
        
        
    }
    
}
