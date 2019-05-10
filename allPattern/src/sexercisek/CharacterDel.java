
package sexercisek;

public class CharacterDel {
    
    public static void main(String[] args) {
        
        String s = "I am Sabuj";
        String g ="";
        
        for (int i = 0; i < s.length(); i++) {
            
            if (i != 3) {
                g += s.charAt(i);
            }
        }
        System.out.println(g);
    }
}
