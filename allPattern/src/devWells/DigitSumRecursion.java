package devWells;

public class DigitSumRecursion {

    public static void main(String[] args) {
        
        int result = digitRecursive(123);
        System.out.println(result);

    }

    static int sum = 0;

    static int digitRecursive(int n) {

        if (n == 0) {
            return sum;
        } else {
            sum += n % 10;
            n = n / 10;

            digitRecursive(n);
        }

        return sum;
    }
}
