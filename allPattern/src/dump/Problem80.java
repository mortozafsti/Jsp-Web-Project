/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dump;

/**
 *
 * @author Cf-37
 */
public class Problem80 {

    private char var;

    public static void main(String[] args) {
        char var1 = 'a';
        char var2 = var1;
        var2 = 'e';
        Problem80 p = new Problem80();
        Problem80 p1 = p;
        p.var = 'i';
        p1.var = 'o';
        System.out.println(var1 + " " + var2);
        System.out.println(p.var + " " + p1.var);
        
        int num = 10;
        int div = 0;
        int ans=0;
        try {
            ans = num / div;
        } catch (ArithmeticException ae) {
           System.out.println("Inalid");
        }
        System.out.println("hfhags " + ans);

    }
}
