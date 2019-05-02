
package dump;

public class Problem77 {
    
    private void init(){ 
        System.out.println("Initialized");
    }
    private void start(){ 
        init();
        System.out.println("Started");
    }
}
 class Test1{ 
    public static void main(String[] args) {
        Problem77 p = new Problem77();
//        p.start();
//        p.init();
    }
    
}
