package Practise;

import java.util.Scanner;

public class Problem42 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] a = new int[n];
        int i,j,num,temp=0;
        
        for (i = 0; i < a.length; i++) {
            num = 1;
            for (j = i+1; j < a.length; j++) {
                if (a[j] < a[num]) {
                     num = j;
                }
            }
            temp = a[i];
            a[i] = a[num];
            a[num] = temp;
        }
        for (i = 0; i < a.length; i++) {
            System.out.println(a[i]+" ");
        }
        
    }
}
