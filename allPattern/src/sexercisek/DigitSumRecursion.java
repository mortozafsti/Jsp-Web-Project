
package sexercisek;

public class DigitSumRecursion {
    
    public static void main(String[] args) {
        
        int d = DigitSumRecursive(523);
        System.out.println(d);
    }
    
    static int DigitSumRecursive(int n){ 
        int sum = 0;
        if (n == 0) {
           return sum;
        }else{ 
            sum += n % 10;
            n = n / 10;
           
            DigitSumRecursive(n); 
           
        }
        return sum;
    }
}
