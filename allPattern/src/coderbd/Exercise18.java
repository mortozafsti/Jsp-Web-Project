
package coderbd;
import java.util.Arrays;
public class Exercise18 {
    public static void main(String[] args) {
        int[] array = {2,4,6,5,8,9,10,-1};
        System.out.println("Origin Array: "+Arrays.toString(array));
        int min = Integer.MAX_VALUE;
        int Second_min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                Second_min = min;
            }else if(array[i] < min){
                Second_min = min;
                min = array[i];
            }else if(array[i] < Second_min){
                Second_min = array[i];
            }
        }
        System.out.println("Second lowest number is : "+Second_min);
    }
}
