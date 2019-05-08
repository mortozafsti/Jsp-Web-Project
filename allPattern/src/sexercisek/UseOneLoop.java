
package sexercisek;

public class UseOneLoop {
    
    public static void main(String[] args) {
        
        int n = 10;
        int ll = 10-8;
        
        for (int i = 1; i<10*2; i++) {
            if(i<=10){
                System.out.print(n+" ");
                n--;
            }
            else{
                if(i==10*2-1){
                    System.out.println(ll);
                }
                else{
                    System.out.print(ll+" ");
                    ll++;
                }
            }
        }
        
        
    }  
}
