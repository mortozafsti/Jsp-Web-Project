
package patternDemo;

public class PatternDemo20 {
    
    public static void main(String[] args) {
        
        int n = 5;
        int count = 0;
        
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("  "+ ++count);
            }
            System.out.println("");
        }
    }
}
