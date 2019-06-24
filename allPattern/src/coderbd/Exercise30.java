package coderbd;

import java.util.Arrays;

public class Exercise30 {

    public static void main(String[] args) {

        int[] array = {10, 30, 20, 40, 50, 60, -20};
        System.out.println("Original Array: "+Arrays.toString(array));
        System.out.println("Result: "+check(array)); 

    }

    public static boolean check(int[] numbers) {

        for (int number : numbers) {
            if (number == 0 || number == -1) {
                return false;
            }
        }
        return true;
    }

}
