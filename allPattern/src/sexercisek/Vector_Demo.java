package sexercisek;

import java.util.Scanner;
import java.util.Vector;

public class Vector_Demo {

    Scanner scan = new Scanner(System.in);
    int m = scan.nextInt();
    int[] n = new int[m];
   

    public static void main(String[] args) {
          
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
        for (int i = 0; i < v.size(); i++) {
            if (i == v.size() - 1) {
                System.out.println(ar[i]);
            } else {
                System.out.println(ar[i] + " ");
            }
        }
    }

}
