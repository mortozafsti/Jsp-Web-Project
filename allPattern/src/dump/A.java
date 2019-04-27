/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dump;

/**
 *
 * @author Cf-37
 */
 class A {

    public void D() {
        System.out.println("A ");
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
         c.D();
     }
    
}
