
package RecursiveAndFunction;

public class GFG {
    
    static void printFun(int test){
        if (test < 1) {
            return;
        }else{
            
            System.out.print(test);
            printFun(test -1);
            System.out.println(test);
            
        }
    }
    
    public static void main(String[] args) {
        int q = 4;
        printFun(q);
    }
}
