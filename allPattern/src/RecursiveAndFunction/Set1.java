package RecursiveAndFunction;

public class Set1 {

    static int fun1(int x, int y) {

        if (x == 0) {
            return y;
        } else {
            return fun1(x - 1, x + y);
        }
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        int c = fun1(x, y);
        System.out.println(c);

    }
}
