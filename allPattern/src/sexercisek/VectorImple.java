package sexercisek;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class VectorImple {

//    public static void main(String[] args) {
//
//        Vector v = new Vector<>();
//
//        v.add(1);
//        v.add(2);
//        v.add("geeks");
//        v.add("forGeeks");
//        v.add(3);
//        v.add(4);
//
//         Vector v1 = new Vector<>();
//
//        v1.add(1);
//        v1.add(2);
//        v1.add("geeks");
//        v1.add("forGeeks");
//        v1.add(3);
//        v1.add(6);
//        
//        System.out.println(v1.capacity());
//        if (v == v1) {
//            System.out.println("Equal");
//        }else{
//            System.out.println("Not Equal");
//        }
//        
//         if (v1.isEmpty()) {
//            System.out.println("Empty");
//        }else{
//            System.out.println("Not Empty");
//        }
//         
//         String[] s = {"M","O","R","T","O","Z","A"};
//         Set set = new HashSet(Arrays.asList(s));
//         
//         System.out.println(s);
//         for (int i = 0; i < set.size(); i++) {
//             System.out.println(set);
//        }
//         
//    }
    
//    public static void main(String[] args) {
//        Vector<String> vector = new Vector<String>();
//        
//        vector.add("G M");
//        vector.add("Mortoza");
//        vector.add("Ahmed");
//        vector.add("Milton");
//        vector.add("Khulna");
//        
//        System.out.println(vector);
//        
//        String[] arr = new String[5];
//        arr = vector.toArray(arr);
//        
//        System.out.println("Th vector is: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        
//    }
    
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<Integer>();
        
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        
        System.out.println(vector);
        
        int[] arr = new int[5];
//        arr = vector.toArray(arr);s
        
        System.out.println("Th vector is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
}
