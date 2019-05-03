package Practise;

import java.util.Scanner;

public class Problem19 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int seconds, minute,hour;
        seconds = scan.nextInt();

        minute = seconds / 60;
        seconds = seconds % 60;
        hour = minute / 60;
        minute = minute % 60;
        
        System.out.println(hour +":"+ minute +":"+ seconds);
    

    }
}
