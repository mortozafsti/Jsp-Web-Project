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
public class problem6 {
    public static void main(String[] args) {
        String[] arr ={"C","B","C","A","D"};
        for(int i =0 ; i<arr.length; i++){
            System.out.println(arr[i] +  " ");
            if(arr[i].equals("C")){
                continue;
            }
            System.out.println("Workdone");
            break;
        }
    }
    
}
