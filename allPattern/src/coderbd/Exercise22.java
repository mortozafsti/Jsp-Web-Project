
package coderbd;

public class Exercise22 {
    
    public static void main(String[] args) {
        
        int[] array1 = {14, -15, 9, 16, 25, 45, 12, 8};
        int[] array2 = {2, 5, 7, 10, 23, 45, -30, 25, -10};
        
        pairs_value(array1, 30);
        pairs_value(array2, 15);
        
    }
    
    static void pairs_value(int[] arr, int number){
        
        System.out.println("Pairs of elements and their sum : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == number) {
                    System.out.println(arr[i]+" + "+arr[j]+ " = "+ number);
                }
            }
        }
    }
    
}
