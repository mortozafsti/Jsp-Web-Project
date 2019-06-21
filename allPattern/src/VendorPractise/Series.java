
package VendorPractise;

public class Series {
    
    private boolean flag;
    
    public void displaySeries(){
        int num = 2;
        while (flag) {            
            if (num % 7 == 0) {
                
                flag = false;
                System.out.println(num);
                num += 2;
                
            }
        }
    }
    
    public static void main(String[] args) {
        
        new Series().displaySeries();
//        
//        int sum = 0;
//        for (int i = 0; i <= 10; i++) {
//            sum += i;
//           
//        } System.out.println(sum);
    }
}
