
package javaCertification;

public class MyFriend {
    
    int x;
    int y;
    
    public void doStuff(int x,int y){
        this.x = x;
        y = this.y;
    }
    
    public void display(){
        System.out.println(x + " " + y + " ");
    }
    
    public static void main(String[] args) {
        
        MyFriend f = new MyFriend();
        f.x = 100;
        f.y = 200;
        
        MyFriend f1 = new MyFriend();
        f1.doStuff(f.x, f.y);
        
        f.display();
        f1.display();
        
    }
    
}
