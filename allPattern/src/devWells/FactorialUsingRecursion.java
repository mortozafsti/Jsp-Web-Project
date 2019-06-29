package devWells;

public class FactorialUsingRecursion {

    public static void main(String[] args) {

        int fact = factorials(5); // finally call the recursive method
        System.out.println(fact);

    }

    static int factorials(int n) {

        if (n == 0) { // This is base case;
            return 1;
        } else {
            return n * factorials(n - 1); // calls the recursive method
        }
            
    }
}
