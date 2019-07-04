package sexercisek;

public class LinearSearchExample1 {

    public static void main(String[] args) {

        int[] arr = {2, 5, 0, 1, 3, 12}; // Search the biggest number
        int x = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if ( x < arr[i] ) {
                 x = arr[i];
            }
        }
        System.out.println(x);
    }

}
