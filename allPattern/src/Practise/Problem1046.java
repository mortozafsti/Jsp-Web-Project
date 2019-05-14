package Practise;

import java.util.Scanner;

public class Problem1046 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int ST = scan.nextInt();
        int ET = scan.nextInt();
        
        if (ST >= ET) {
            System.out.printf("O JOGO DUROU %d HORA(S)\n", 24-(ST-ET));
        }else{ 
            System.out.printf("O JOGO DUROU %d HORA(S)\n",(ET-ST));
        }
    }

}
