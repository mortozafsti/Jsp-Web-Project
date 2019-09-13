package javaCertification;

public class Equals {

    public static void main(String[] args) {
        String str = "Java";
        String str1[] = {"J", "a", "v", "a"};
        String str2 = "";
        
        for (String s : str1) {
            str2 = str2+s;
        }
        
        boolean b1 = (str == str2);
        boolean b2 = (str.equals(str2)); 
        
        System.out.println(b1 + " " + b2);
        System.out.println(str2);
        
    }

}
