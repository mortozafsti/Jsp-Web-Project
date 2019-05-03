package Practise;

import java.util.Scanner;

public class Problem20 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int year,month,days;
        int  ageIndays = scan.nextInt();
        
        month = ageIndays % 365;
        year = ageIndays / 365;
        
        days = month % 365;
        month = month / 30;
        
        days = days % 30;
        
        System.out.println(year+" ano(s)");
        System.out.println(month+" mes(es)");
        System.out.println(days+" dia(s)");
    

    }
}
