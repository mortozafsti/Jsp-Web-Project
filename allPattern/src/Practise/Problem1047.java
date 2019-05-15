package Practise;

import java.util.Scanner;

public class Problem1047 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int STH = scan.nextInt();
        int STM = scan.nextInt();
        int ETH = scan.nextInt();
        int ETM = scan.nextInt();
        
        int rt,rm;
        
        rt = ETH - STH;
        
        if (rt < 0) {
            rt = 24 + (ETH - STH);
        }
        
         rm = ETM - STM;
         
        if (rm < 0) {
            rm = 60 + (ETM - STM);
            rt--;
        }
        
        if (ETH == STH && ETM == STM) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }else{ 
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",rt,rm);
        }
    }

}
