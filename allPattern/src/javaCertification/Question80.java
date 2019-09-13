
package javaCertification;

public class Question80 {
    
    public static void main(String[] args) {
        
        try {
            int num = 10;
            int div = 0;
            int ans = num / div;
        } catch (ArithmeticException ae) {
            //ans = 0;
        }catch(Exception e){
            System.out.println("Invalid Calculation");
        }
       // System.out.println("Ans ="+ ans);
    }
    
}
