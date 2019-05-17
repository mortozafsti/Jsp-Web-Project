
package sexercisek;

import java.util.Scanner;

public class HackerRankStringReverse {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String c = "";
        
        for(int i = s.length()-1; i >= 0; i--){
            c +=s.charAt(i);
        }
        
        if (s.equals(c)) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
