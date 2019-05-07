package Practise;

import java.util.Scanner;

public class Problem40 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float N5,recalaverage;
        
        float N1 = scan.nextFloat();
        float N2 = scan.nextFloat();
        float N3 = scan.nextFloat();
        float N4 = scan.nextFloat();
        
        float avg = ( (N1*2) + (N2*3) + (N3*4) + (N4*1) ) / 10; 
        
        if (avg >= 7.0) {
            System.out.printf("Media: %.1f\n",avg);
            System.out.println("Aluno aprovado.");
        }else if(avg >= 5.0 && avg <= 6.9){ 
            System.out.printf("Media: %.1f\n",avg);
            System.out.println("Aluno em exame.");
            
            N5 = scan.nextFloat();
            System.out.printf("Nota do exame: %.1f\n",N5);
            
            recalaverage = ( avg + N5 ) / 2;
            if (recalaverage >= 5.0 ) {
                System.out.println("Aluno aprovado.");
            }else{ 
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n",recalaverage);
        }else if( avg < 5.0 ){ 
             System.out.printf("Media: %.1f\n",avg);
             System.out.println("Aluno reprovado.");
        }
    }
} 

    