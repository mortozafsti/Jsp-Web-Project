
package coderbd;

public class Exercise4 {
    
    public static void main(String[] args) {
        
      int number[] = {5,8,9,12,9,5};
      int sum = 0;
      double average = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
            average = sum / number.length;
           
        }
        System.out.println("The sum is: "+sum);
        System.out.println("The Sum of Average is: "+average);
    }
    
}
