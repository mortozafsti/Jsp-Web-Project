
package devWells;

public class PalindomTest {
    
    public static void main(String args[]) {
        
        System.out.println("Is Milton Palindrom? " + isPalindomString("madam"));
        System.out.println("Is Mom Palindrom? " + isPalindomString("mom"));
        
    }
    
    public static boolean isPalindomString(String text){
        
        String reverse = reverse(text);
        
        if (text.equals(reverse)) {
            return true;
        }
        return false;
    }
    
    public static String reverse(String input){
        
        if (input == null || input.isEmpty()) {
            return input;
        }
        
        return input.charAt(input.length()-1) + reverse(input.substring(0,input.length() - 1));
    }
}
