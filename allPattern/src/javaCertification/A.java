
package javaCertification;

public class A {

    public A() {
        System.out.println("A ");
    }

    void test() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
class B extends A{

    public B() {
        System.out.println("B ");
    }
    
}
class C extends B{

    public C() {
        System.out.println("C ");
    }
    
    public static void main(String[] args) {
        
        C c = new C();
        
    }
    
}
