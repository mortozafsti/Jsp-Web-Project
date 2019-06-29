
package devWells;

public class FibonacciSeriesUsingRecursive {
    
    public static void main(String[] args) {
        
        int n = 11;
        for (int i = 0; i < n; i++) {
            System.out.print(fiboSeries(i)+" "); 
        }
        
    }
    
    static int fiboSeries(int n){
        
        if (n == 0) {
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return (fiboSeries(n-1)+ fiboSeries(n-2));
        }
    }
}
