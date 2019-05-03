
package Practise;

import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int time = scan.nextInt();
        int speed = scan.nextInt(); 
        
        int perliter = 12;
        float distance = time * speed;
        float liters = distance / 12;
        
        System.out.printf("%.3f\n",liters);
        
    }
}
