
package coderbd;

public class Exercise23 {
    
    public static void main(String[] args) {
        
        int[] array1 = {11, 23, 44, 55, 78, 90};
        int[] array2 = {11, 23, 44, 88, 78, 90};
        int[] array3 = {11, 23, 44, 55, 78, 90};
        
        checking_equality(array1,array2);
        checking_equality(array1, array3);
    }

    private static void checking_equality(int[] array1, int[] array2) {
        
        boolean equalOrNot = true;
        
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    equalOrNot = false;
                }
            }
        }else{
            equalOrNot = false;
        }
        if (equalOrNot) {
            System.out.println("Two arrays are Equal");
        }else{
            System.out.println("Two arrays are Not Equal");
        }
    }
}
