
package javaCertification;

public class Question36 {
    
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Duke");
        String s = sb.toString();
        
        String str2 = s;
        
        System.out.println(s = str2);
    }
}
