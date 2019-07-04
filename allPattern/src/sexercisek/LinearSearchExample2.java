package sexercisek;

public class LinearSearchExample2 {

    public static void main(String[] args) {

        int[] arr = {-2, 5, 0, -1, -3, 12, 7}; // count the positive and negative number
        int x = arr[0];
        int count = 0;
        
        for (int i = 1; i < arr.length; i++) {
            if ( 0 <= arr[i] ) {
                count++;
            }
        }
        
        int negative = arr.length-count;
        
        System.out.println("Posittive Count: "+count);
        System.out.println("Negative Count: "+negative);
    }

}
