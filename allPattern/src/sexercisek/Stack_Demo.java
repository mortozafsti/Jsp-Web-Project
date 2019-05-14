package sexercisek;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Demo {

    static Scanner scan = new Scanner(System.in);
    static int n = scan.nextInt();
    static Stack st = new Stack(n);
    //static int ll;
    public static void main(String[] args) {

        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            st.push(x);
        }
//        System.out.println(st);
        int maxvalue = -999;
        while (!st.empty()) {            
            int ll = (int) st.pop();
            if (maxvalue < ll) {
                maxvalue = ll;
            }st.pop();
        }
        
        System.out.println();
    }

}
