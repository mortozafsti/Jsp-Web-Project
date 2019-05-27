package Practise;

import java.util.Scanner;

public class Problem1071 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int X = scan.nextInt();
        int Y = scan.nextInt();
        int sumOfOddNumber = 0;
        
        if (X > Y) {
            for (int i = X - 1; i > Y; i--) {
                if (i % 2 != 0) {
                    sumOfOddNumber += i;
                }
            }
        }else{
            for (int i = Y - 1; i > X; i--) {
                if (i % 2 != 0) {
                    sumOfOddNumber += i;
                }
            }
        }
        System.out.println(sumOfOddNumber);
    }
}
