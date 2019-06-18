
package VendorPractise;

public class Test2 {
    
    public static final int MIN = 1;
    
   public static boolean checkPoint(int x){
       return ( x >= MIN ) ? true : false;
   }
   
    public static void main(String[] args) {
        int x = args.length;
        if (checkPoint(x)) {
            System.out.println("Java SE");
        }else{
            System.out.println("Java EE");
        }
    }
    
}
