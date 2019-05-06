package sexercisek;

import java.util.Scanner;

public class StringR {

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String s = "My Name is Sabuj";
//        int c = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s == " ") {
//          
//                c++;
//            }
//        }
//        System.out.println(c);
//    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = "My Name is Sabuj";
        String c = "";
        for (int i = s.length() - 1; i >= 0; i--) {
           c += i;
        }
        System.out.println(c);
    }
}
