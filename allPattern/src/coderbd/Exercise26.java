package coderbd;

public class Exercise26 {

    public static void main(String[] args) {

        int[] array = {0, 1, 0, 0, 3, 5, 0, 0, 8, 9};
        int i = 0;
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int j = 0, l = array.length; j < l;) {
            if (array[j] == 0) {
                j++;
            } else {
                int num = array[i];
                array[i] = array[j];
                array[j] = num;
                i++;
                j++;
            }
        }
        while (i < array.length) {
            array[i++] = 0;
        }
        for (int n : array) {
            System.out.print(n + " ");
        }

        System.out.println();

    }
}
