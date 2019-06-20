
package RecursiveAndFunction;

public class PrimeNumberUsingForLoop {
    
    public static void main(String[] args) {
        int count = 0;
        int n = 57;
        for (int i = 1; i <= n; i++) {
            if (n%i == 0) {
                count++;
            }
        }
        
        if (count == 2) {
            System.out.println("Prime number");
        }else{
            System.out.println("Not Prime number");
        }
    }
}
