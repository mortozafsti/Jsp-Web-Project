package RecursiveAndFunction;

public class PrimeNumberUsingRecursion {

    static int count = 0;
    static int i = 1;

    static int primeNumber(int num) {
        if (i <= num) {
            if (num % i == 0) {
                count++;
            }
            i++;
            primeNumber(num);
        }
        return count;
    }

    public static void main(String[] args) {

        PrimeNumberUsingRecursion p = new PrimeNumberUsingRecursion();
        int c = p.primeNumber(11);

        if (c == 2) {
            System.out.println("prime number "+i+" "+count);
        } else {
            System.out.println("Not a prime number ");
        }
    }

}
