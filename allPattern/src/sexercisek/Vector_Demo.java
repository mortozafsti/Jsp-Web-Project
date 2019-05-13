package sexercisek;

import java.util.Scanner;
import java.util.Vector;

public class Vector_Demo {

   static Scanner scan = new Scanner(System.in);
   static int m = scan.nextInt();
   static int[] n = new int[m];
   

    public static void main(String[] args) {
        for (int i = 0; i < m; i++) {
            n[i] = scan.nextInt();
        }
  
        Vector_Demo vd = new Vector_Demo();
          vd.printUniqueValue(n);
    }
    
    Vector v = new Vector();
    
    void printUniqueValue(int ar[]) {

        for (int i = 0; i < ar.length; i++) {

            int c = 0;
            for (int j = 0; j < ar.length; j++) {

                if (ar[i] == ar[j]) {
                    c++;
                }
            }
            if (c == 1) {
                v.add(ar[i]);
            }
        }
        System.out.println(v);
//        for (int i = 0; i < v.size(); i++) {
//            if (i == v.size() - 1) {
//                System.out.println(v);
//            } else {
//                System.out.print(v + " ");
//            }
//        }
    }

}
