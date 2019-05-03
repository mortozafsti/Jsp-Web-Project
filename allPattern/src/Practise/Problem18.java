package Practise;

import java.util.Scanner;

public class Problem18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int fiftyT = N % 100;
        int hundredT = N / 100;

        int twentyT = fiftyT % 50;
        fiftyT = fiftyT / 50;

        int tenT = twentyT % 20;
        twentyT = twentyT / 20;

        int fiveT =tenT % 10;
        tenT = tenT / 10;
        
        int twoT =fiveT % 5;
        fiveT = fiveT / 5;
        
        int oneT =twoT % 2;
        twoT = twoT / 2;
        
        oneT = oneT / 1;
        
        
        System.out.println(N);

        System.out.printf(hundredT + " nota(s) de R$ 100,00\n");
        System.out.printf(fiftyT + " nota(s) de R$ 50,00\n");
        System.out.printf(twentyT + " nota(s) de R$ 20,00\n");
        System.out.printf(tenT + " nota(s) de R$ 10,00\n");
        System.out.printf(fiveT + " nota(s) de R$ 5,00\n");
        System.out.printf(twoT + " nota(s) de R$ 2,00\n");
        System.out.printf(oneT + " nota(s) de R$ 1,00\n");

    }
}
