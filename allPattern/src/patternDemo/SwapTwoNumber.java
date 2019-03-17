package patternDemo;

public class SwapTwoNumber {

//    public static void main(String[] args) {
//
//        int a = 9;
//        int b = 8;
//
//        a = a + b;
//
//        b = a - b;
//        a = a - b;
//
//        System.out.println("After Swapig: ");
//        System.out.println("A = " + a);
//        System.out.println("B = " + b);
//
//    }
//    public static void main(String[] args) {
//        
//        int a = 23;
//        int b = 44;
//        int temp;
//        
//        temp = a;
//        a = b;
//        b = temp;
//        
//        System.out.println("After Swapig: ");
//        System.out.println("A = " + a);
//        System.out.println("B = " + b);
//        
//    }
    int fact(int n) {
        
        if (n == 1) {
            return 1;
        } else {
            return n = n * fact(n - 1);
        }
        
    }
    
    public static void main(String[] args) {
        SwapTwoNumber stn = new SwapTwoNumber();
        System.out.println("Factorial Of 6 is = "+stn.fact(6)); 
    }
}
