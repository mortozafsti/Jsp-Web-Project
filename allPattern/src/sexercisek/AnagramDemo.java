
package sexercisek;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDemo {
    
    
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        char a = scan.equals(scan);
        String b = scan.next();
        
        boolean ret = isAnagram(a,b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

   static boolean isAnagram(String a,String b) {
        
        int s1 = a.length();
        int s2 = b.length();
        
        if (s1 != s2) 
            return false;
        
        Arrays.sort(a.);
    }
   
   
   
    
}
