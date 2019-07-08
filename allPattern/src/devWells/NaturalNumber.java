package devWells;

public class NaturalNumber {
    
    public static void main(String[] args) {
        
        int d = nnumber(0);
        System.out.println(d);
        
        
    }
    
    public static int nnumber(int n){
    
        if (n > 50) {
            return 0;
        }else{
            System.out.print(n + " ");
            return nnumber(n + 1);
            
        }
    }
}
