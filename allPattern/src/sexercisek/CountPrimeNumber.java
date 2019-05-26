
package sexercisek;

public class CountPrimeNumber {
    
    public static void main(String[] args) {
        
        int num =11;
        int cout = 0;
        
        for (int i = 2; i <= num-1; i++) {
             if (num % i == 0) {
                cout = cout + 1;
            }
        }
        
        if (cout > 0) {
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }
    }
}
