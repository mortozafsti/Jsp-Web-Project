
package devWells;

public class StringReverseByPosition {
    
    public static void main(String[] args) {
        
        
        String name = "G M Mortoza Ahmed";
        String count = "";
        String result = "";
        
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ' || name.charAt(i) == '\n' || i == name.length()-1) {
                for (int j = count.length() -1; j >= 0; j--) {
                    result += count.charAt(j);
                }
                result += " ";
                count = "";
            }else{
                count += name.charAt(i);
            }
        }
        System.out.println(result);
    }
    
}
