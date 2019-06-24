
package coderbd;

public class Exercise24 {
    
    public static void main(String[] args) {
        
        int total_numbers;
        //int[] numbers  = new int[]{9,10,11,12,14,15};
        int[] numbers  = new int[]{1,2,3,4,6,7};
        
        total_numbers = 7;
        int total_sum = total_numbers * ((total_numbers + 1) /2 );
        
        int numbers_sum = 0;
        
        for (int number : numbers) {
            numbers_sum += number;
        }
       
        System.out.print(total_sum - numbers_sum);
        System.out.println("");
        
    }
    
}
