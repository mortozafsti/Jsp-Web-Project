
package RecursiveAndFunction;

public class PrimeNumbers {
    
    public static void main(String[] args) {
        int i;
        int count;
        
        for (int j = 1; j <= 100; j++) {
            count = 0;
            for (i = 1; i <= j; i++) {
                if (j%i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(j+" ");
            }
        }
    }
}
