
package javaCertification;

public class Question129 {
    
    int x,y;
    
    public Question129(int x,int y){
        initialized(x, y);
    }
    
    public void initialized(int x, int y){
        this.x = x*x;
        this.y = y*y;
        
    }
    
    public static void main(String[] args) {
        int x = 5,y = 7;
        
        Question129 obj = new Question129(x,y);
        System.out.println(x+" "+y);
        
    }
}
