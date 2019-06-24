
package coderbd;

public class Exercise6 {
    
    public static boolean containSpecificValue(int[] array, int value){
        for (int i : array) {
            if (value == i) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        
        int[] arr = {52,7,9,3,8,6,4,2,1,61,55,50,90};
        
        System.out.println(containSpecificValue(arr, 52));
        System.out.println(containSpecificValue(arr, 24));
    }
}
