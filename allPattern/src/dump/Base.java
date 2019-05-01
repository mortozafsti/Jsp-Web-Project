
package dump;

public class Base {
    
    public void test(){
        System.out.println("Base ");
    }
}
class DrivedA extends Base{
    public void test(){
        System.out.println("DrivedA ");
    }
}
class DrivedB extends DrivedA{
    public void test(){
        System.out.println("DrivedB ");
    }
    public static void main(String[] args) {
        Base b1 = new DrivedB();
        Base b2 = new DrivedA();
        Base b3 = new DrivedB();
        
        b1 = (Base) b3;
        Base b4 =(DrivedA) b3;
        Base b5 =(DrivedA) b2;
        
        
        b1.test();
        b4.test();
        b5.test();
        
        System.out.println("5 + 2 = "+3 +4);
        System.out.println("5 + 2 = "+(3 +4));
    }
}

