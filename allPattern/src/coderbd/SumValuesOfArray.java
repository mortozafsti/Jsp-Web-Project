
package coderbd;

public class SumValuesOfArray {
    // Exercise 2
    
    public static void main(String[] args) {
        int array[] = {5,8,9,12,4,5};
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println("The Sum is: "+sum);
    }
}
