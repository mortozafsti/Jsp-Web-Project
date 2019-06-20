package RecursiveAndFunction;

public class PrimeInStaticMethod {

    public static void main(String[] args) {

        primeCall(5);
        //System.out.println(n);

    }

    static void primeCall(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Prime");

        }else{
            System.out.println("Not Prime");
        }
    }
}
