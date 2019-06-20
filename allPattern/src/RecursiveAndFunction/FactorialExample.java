
package RecursiveAndFunction;

public class FactorialExample {
    
    public static void main(String[] args) {
        
        int n = (int) factorial(5);
        System.out.println(n);
        
    }
    
    public static long factorial(int n){
        if (n == 0) {
            return 1;
        }else{
            return n * factorial( n - 1 ); // Recursive Call
        }
    }
    
}
