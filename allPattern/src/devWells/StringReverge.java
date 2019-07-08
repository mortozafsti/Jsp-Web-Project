
package devWells;

public class StringReverge {
    
    public static void main(String[] args) {
        
        String name = "madak";
        String count = "";
        
        for (int i = name.length()-1; i >= 0; i--) {
            count += name.charAt(i);
        }
        System.out.println("The Original String is: "+name);
        System.out.println("The Reverse String is: "+count);
        
    }
    
}
