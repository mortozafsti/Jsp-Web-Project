package devWells;

public class SeriesEample {

    public static void main(String[] args) {

        int lowerbound = 7;
        int upperbound = 42;
        int sum = recursive(lowerbound, upperbound);
        System.out.println(sum);

    }
    
   static int sum = 0;
    public static int recursive(int a, int b) {
        
        if (a == b) {
            sum += a;
            return sum;
        }else{
            sum += a;
            a += 5;
            return recursive(a, b);
        }
        
    }

}
