
package patternDemo;

public class PatternDemo8 {
    
    public static void main(String[] args) {
        int n = 5;
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= n- row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(""+row%2);
            }
            System.out.println("");
        }
    }
}
