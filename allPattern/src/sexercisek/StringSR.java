package sexercisek;

public class StringSR {

    public static void main(String[] args) {
        String s = "My Name is Mortoza";
        String g = "";
        String l = "";
        
        for (int i = 0; i < s.length(); i++) {
           // s += s.charAt(i);
            if (s.charAt(i) ==  ' ' || s.charAt(i) == '\n' || i == s.length()-1) {
                for (int j = g.length() - 1; j >= 0; j--) {
                    l += g.charAt(j);
                }
                l += " ";
                g = "";
            } else {
                g += s.charAt(i);
            }
        }
        System.out.println(l);
    }

}
