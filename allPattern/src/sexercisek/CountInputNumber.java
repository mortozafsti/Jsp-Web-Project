
package sexercisek;

public class CountInputNumber {
    public static void main(String[] args) {
        
        int d = CountNum(2345);
        System.out.println(d);
        
    }
    
    static int CountNum(int n){ 
        int count = 0;
        while (n>0) {            
            count++; 
            n = n / 10;
        }
        return count;
    } 
}
