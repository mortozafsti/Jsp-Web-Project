package sexercisek;

public class OneToHundredPrimeNumber {

    static boolean x = false;
    static int n = 200;

    public static void main(String[] args) {

        for (int i = 1; i <= 200; i++) {
            int c = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    x = true;
                }
            }
            if (x == true) {
                System.out.println("Not Prime");
            } else {
                System.out.println("Prime");
            }
        }
    }
}
