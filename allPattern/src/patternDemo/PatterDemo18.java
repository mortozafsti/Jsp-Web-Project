
package patternDemo;

public class PatterDemo18 {
    
    public static void main(String[] args) {
        
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == n ||  col == 1 || col == row) {
                     System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
