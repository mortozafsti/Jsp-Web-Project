
package javaCertification;

public class AppTest {
    
    String mystr = "7007";
    
    public void doStuff(String str){
        int myNum = 0;
        try {
            String mystr = str;
            myNum = Integer.parseInt(mystr);
        } catch (NumberFormatException e) {
            System.out.println("Error");
        }
        System.out.println("Mystr " + mystr + " " + "MyNum " + myNum);
    }
    
    public static void main(String[] args) {
        AppTest test = new AppTest();
        test.doStuff("9009");
         
    }
    
}
