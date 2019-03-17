package patternDemo;

public class RecursioDemo {

    int fact(int n) {
        if (n == 1) {
            return 1;
        }else{
            return n * fact(n - 1);
        }
    }
    
    public static void main(String[] args) {
        RecursioDemo rd = new RecursioDemo();
        int result = rd.fact(6);
        System.out.println("Factorial of: 6 = "+ result); 
    }

}
