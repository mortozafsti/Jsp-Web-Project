
package patternDemo;

public class PatterDemo19 {
    
    public static void main(String[] args) {
        
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col == row || row+col == n+1) {
                     System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
