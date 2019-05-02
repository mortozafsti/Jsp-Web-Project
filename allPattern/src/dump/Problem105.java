package dump;

import java.util.ArrayList;

public class Problem105 {

    char c;
    boolean b;
    float f;

    int s;
    double d;
    long l;
    Integer ii;

    void printAll() {
        System.out.println("C = " + c);
        System.out.println("B = " + b);
        System.out.println("F = " + f);
        System.out.println("I = " + s);
        System.out.println("D = " + d);
        System.out.println("Integer = " + ii);
        System.out.println("long = " + l);
    }

    public static void main(String[] args) {
        int [] a;
        a = new int[2];
        a[0]=10;
        a[1]=20;
        a=new int[4];
        a[2]=30;
        a[3]=40;
        
        for (int i : a) {
            System.out.println(" " + i);
            
        }
        ArrayList<Integer> aaa= new ArrayList<>();
        aaa.add(1);
        aaa.add(2);
        aaa.add(3);
        aaa.add(4);
        aaa.add(null);
        System.out.println(aaa);
        System.out.println(aaa.size());
        aaa.remove(2);
        System.out.println(aaa);
        aaa.remove(3);
        System.out.println(aaa);
        aaa.add(50);
        System.out.println(aaa);
        
        
        Problem105 p = new Problem105();
        p.printAll();
    }
}
