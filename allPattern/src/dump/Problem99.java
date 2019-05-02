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
public class Problem99 {

    int count;

    public static void display() {
//    count++;
//        System.out.println(""+count);
    }

    public static void main(String[] args) {
        String names[] = {"Thomas", "Peter","Joseph"};
        String pws[] = new String[3];
        int idx = 0;
        try {
            for (String n : names) {
                pws[idx] = n.substring(2, 6);
                idx++;
            }
        } catch (Exception e) {
            System.out.println("Inalid name");
        }
        for (String p : pws) {
                System.out.println(p);
            }

    }
}
