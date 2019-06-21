
package VendorPractise;

public class Question131 {
    
    public static void main(String[] args) {
        try {
            String[] s = new String[4];
            s[1] = "Unix";
            s[2] = "Linux";
            s[3] = "Solaries";
            for (String s1 : s) {
                System.out.println(s1+" ");
            }
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
    }
}
