
package devWells;

public class SeriesExample2 {
    
    static int fiboArray[] = new int[12]; 
    public static void main(String[] args) {
        fibo();
        int n = 6;
        System.out.println(fiboArray[n-1]);
        //System.out.println("Series is: "+fiboArray);
    }

    
    public static void fibo() {
        fiboArray[0] = 1;
        fiboArray[1] = 1;
        for (int i = 2; i < 12; i++) {
            fiboArray[i] = fiboArray[i-1] + fiboArray[i-2];
            System.out.print(fiboArray[i]+" ");
        }
    }
}
