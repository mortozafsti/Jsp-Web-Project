
package ocaAndocp;

public class PerfectNumber {
    
    public static void main(String[] args) {
        
        int n = 6;
        int sum = 1;
        int count = 0;
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        
        if (sum == n) {
            System.out.println(n + " is Perfect Number");
        }else{
            System.out.println(n + " is Not Perfect Number");
        }
        
    }
}
