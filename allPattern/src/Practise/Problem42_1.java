package Practise;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Problem42_1 {

//    public static void main(String[] args) {
//        int[] a = {7, 21, -14};
//        Arrays.sort(a);
//        System.out.println(Arrays.toString(a)); 
//    }
    public static void main(String[] args) {
        Integer[] a ={13, 7, 6, 45, 21, 9, 2, 100};
        Arrays.sort(a,Collections.reverseOrder());
        System.out.println(Arrays.toString(a)); 
        
    }
}
