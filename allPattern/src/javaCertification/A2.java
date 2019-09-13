
package javaCertification;

public class A2 {
    
    public void test(){
        System.out.println("A");
    }
}
class B2 extends A2{
    
    public void test(){
        System.out.println("B");
    }
}
class C2 extends A2{
    
    public void test(){
        System.out.println("C");
    }
    
    public static void main(String[] args) {
        
        A a1 = new A();
        A a2 = new C();
        
        a1 =(A) a2;
        
        A a3 = (B) a2;
        
        a1.test();
    }
}
