
package sexercisek;

public class DigitSumRecursionAgain {
    
    public static void main(String[] args) {
        
        int d = DigitSumRecursive(678);
        System.out.println(d);
    }
    
    static int DigitSumRecursive(int n){ 
       
        if (n == 0) 
            return 0;
            return (n % 10 + DigitSumRecursive(n/10));
        
    }
}
