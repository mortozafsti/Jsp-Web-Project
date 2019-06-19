/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VendorPractise;

/**
 *
 * @author Cf-37
 */
public class checkAmount {
    
    public int amount;

    public checkAmount() {
        this.amount = 200;
    }
    
  
    
} 

class Testq{
    public static void main(String[] args) {
        checkAmount acct = new checkAmount();
        checkAmount acct1 = new checkAmount();
        int s =acct.amount = 100;
        int s1 =acct.amount = 100;
        System.out.println(s);
    }
}
