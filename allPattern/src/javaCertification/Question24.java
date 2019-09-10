
package javaCertification;

public class Question24 {
    
    public static void main(String[] args) {
        
        String[][] chs = new String[2][];
        
        chs[0] = new String[2];
        chs[1] = new String[5];
        
        int i = 97;
        
        for (int a = 0; a < chs.length; a++) {
            for (int b = 0; b < chs.length; b++) {
                chs[a][b] = "" + i;
                i++;
            }
        }
        
        for (String[] ch : chs) {
            for (String ca : ch) {
                System.out.print(ca+" ");
            }
            System.out.println();
        }
    }
    
}
