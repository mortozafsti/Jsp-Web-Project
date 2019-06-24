
package coderbd;

import java.util.ArrayList;

public class Exercise25 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int array1[] = {2, 5, 7};
        int array2[] = {2, 3, 4, 5, 7, 16};
        int array3[] = {4, 5, 7, 8};
        
        int x = 0, y = 0, z = 0;
        
        while (x < array1.length && y < array2.length && z < array3.length) {            
            if (array1[x] == array2[y] && array2[y] == array3[z]) {
                list.add(array1[x]);
                x++;
                y++;
                z++;
            }else if(array1[x] < array2[y]){
                x++;
            }else if(array2[y] < array3[z]){
                y++;
            }else{
                z++;
            }
        }System.out.println("Common Element: "+ list);
    }
}
