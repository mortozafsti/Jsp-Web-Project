package ocaAndocp;

public class MathFunction {

    public static void main(String[] args) {

        int a = 15;
        int b = 10;
        MathFunction.addToInt(a, b);
        System.out.println(a);
    }

    public static void addToInt(int x, int amountToAdd) {
        x = x + amountToAdd;    
    }

}
