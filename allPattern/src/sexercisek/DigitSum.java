
package sexercisek;

public class DigitSum {
    
    public static void main(String[] args) {
        
        int d = CountNum(678);
        System.out.println(d);
        
    }
    
    static int CountNum(int n){ 
        int count = 0;
        while (n>0) {            
            count += n % 10; 
            n = n / 10;
        }
        return count;
    }
    
}
