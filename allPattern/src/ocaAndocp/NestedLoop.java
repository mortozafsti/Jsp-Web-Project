
package ocaAndocp;

public class NestedLoop {
    
    public static void main(String[] args) {
        
        int[][] myloop = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
        
        for (int[] ss : myloop) {
            for (int i = 0; i < ss.length; i++) {
                System.out.print(ss[i]+"\t");
            }
            System.out.println();
        }
    }
}
