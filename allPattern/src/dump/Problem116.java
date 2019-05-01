
package dump;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Problem116 {
    public static int stVar = 100;
    public int var = 200;
    
    
    public String toString(){
        return var + ":" + stVar;
    }
    
    public static void main(String[] args) {
        int x = args.length;
        Problem116 p = new Problem116();
        p.var = 300;
        System.out.println(p);
        
        Problem116 p1 = new Problem116();
        p1.stVar = 300;
        System.out.println(p1);
        
        float var1 = (12_341.01 >= 123_45.00) ? 12_456 : 124_56.02f;
        float var2 = var1 + 1024;
        System.out.println(var2);
        System.out.println(x);
        
        LocalDateTime dt = LocalDateTime.of(2007, 07, 31, 1, 1);
        dt.plusDays(30);
        dt.plusMonths(1);
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
        
    }
    
}
