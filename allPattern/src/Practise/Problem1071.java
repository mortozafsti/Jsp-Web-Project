package Practise;

import java.io.IOException;
import java.util.Scanner;

public class Problem1071 {

    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        
        int X = scan.nextInt();
        int Y = scan.nextInt();
        int countOddNumber = 0;
        
        if (X > Y) {
            for (int i = X - 1; i > Y; i--) {
                if (i % 2 == 1) {
                    countOddNumber += i;
                }
            }
        }else{
            for (int i = Y - 1; i > X; i--) {
                if (i % 2 == 1) {
                    countOddNumber += i;
                }
            }
        }
        System.out.println(countOddNumber);
    }
}
