package Practise;

import java.util.Scanner;

public class Problem1047 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int STH = scan.nextInt();
        int STM = scan.nextInt();
        int ETH = scan.nextInt();
        int ETM = scan.nextInt();
        
        if (STH >= ETH && STM >= ETM) {
            System.out.printf("O JOGO DUROU %d HORA(S)\n", 24-(STH-ETH),1-(STM-ETM));
        }else{ 
            //System.out.printf("O JOGO DUROU %d HORA(S)\n",(ET-ST));
        }
    }

}
