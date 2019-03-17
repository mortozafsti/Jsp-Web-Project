
package patternDemo;

public class Exam {
   
   
    public static void main(String[] args) {
        
         int n = 7;
         
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(""+col);
            }
            System.out.println("");
       
        for ( row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(""+col);
            }
            System.out.println("");
        }
         }
    }
}
