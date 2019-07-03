package devWells;

public class NaturalNumber {
    
    public static void main(String[] args) {
        
        nnumber(0);
        
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
