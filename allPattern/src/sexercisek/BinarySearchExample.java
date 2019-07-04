package sexercisek;

public class BinarySearchExample {

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18};

        int key = 16;
        int value=0;
        int mid;
        int low = 0;
        int high = 8;

        while (low <= high) {

            mid = (low + high) / 2;

            if (key == arr[mid]) {
                value = mid;
                break;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else if (key > arr[mid]) {
                low = mid + 1;
            }
        }
        System.out.println(value);
    }
}
