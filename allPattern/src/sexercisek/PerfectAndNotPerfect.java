package sexercisek;

public class PerfectAndNotPerfect {

    public static void main(String[] args) {
        int sum = 0;
        int n =0;
       
        for (int i = 1; i <= 100; i++) {
              n = i;
            for (int j = 1; j <= i; j++) {
                if (n % j == 0) {
                    sum += j;
                }
            }
        }
        
        if (sum == n) {
            System.out.println("Perfect");
        }else{ 
            System.out.println("Not Perfect");
        }
    }
}
