package lightoj;

public class Problem1 {

    public static void main(String[] args) {
        
        int n = 2;
        int a = 9;
        int b = 8;
        
        for (int i = 1; i <= n; i++) {
            
            System.out.println("Case " + i + " : " + b);
            
            for (int j = 2; j <= n; j++) {
                System.out.println("Case " + i + " : " + (a+b));
            }
            
        }
    }
}
