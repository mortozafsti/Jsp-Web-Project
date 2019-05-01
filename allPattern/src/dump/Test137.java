package dump;

import java.util.Scanner;

public class Test137 {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        if (x++ > ++y) {
            System.out.println("Hllo ");
        }else{
            System.out.print("Wellcome ");
        }
        System.out.println("Log "+ x + ":" + y);
    }
}
