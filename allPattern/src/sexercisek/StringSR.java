
package sexercisek;

public class StringSR {
    
    public static void main(String[] args) {
        String s = "My Name is Mortoza";
        String g = "";
        String l = "";
        
        for (int i = 0; i < s.length(); i++) {
            if (s == " " || s == "\n") {
                for (int j = g.length()-1; j >= 0; j--) {
                  l += i;  
                  
                }
            }
            else{ 
                g += i;
            }
        }
        System.out.println(l);
    }
    
}
