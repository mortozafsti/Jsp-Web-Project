
package ocaAndocp;

public class PerfectNumberOnetoHundred {
    
    public static void main(String[] args) {
        
        //int sum = 0;
        for (int i = 1; i < 100; i++) {
            int n = i;
            int ll = i;
            int sum = 0;
            for (int j = 1; j < n; j++) {
                if (n % j == 0) {
                    sum += j;
                }
            }
            
            if (sum == ll) {
                System.out.println("Perfect Number");
            }else{
                System.out.println("Not Perfect Number");
            }
        }
        
    }
}
