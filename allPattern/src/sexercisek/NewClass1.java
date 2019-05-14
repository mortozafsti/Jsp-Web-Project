package sexercisek;

public class NewClass1 {

    static int count = 0;

    public static void main(String[] args) {

        for (int i = 1; i <= 200; i++) {
            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    count = count + 1;
                }
            }
            if (count == 0) {
                System.out.print(i+" ");
            } else {
                count = 0;
            }
        }
    }
}
