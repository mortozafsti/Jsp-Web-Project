
package mahabubulHasan;

import static java.lang.Math.sqrt;

public class calculating2Ddistance {
    
     static double distance(int x1,int x2,int y1,int y2) {
        
        // return Math.sqrt(Math.pow(x2 - x1, 2)+Math.pow(y2 - y1, 2));
        
        double s = Math.sqrt(Math.pow(x2-x1,2));
        double s1 = Math.sqrt(Math.pow(y2-y1,2));
        double re = Math.sqrt(s*s+s1*s1); 
        return re;
//        double x = (x2-x1);
//        double y = (y2-y1);
//        double res = x*x + y*y;
//        return Math.sqrt(res);
    }
    
    
    public static void main(String[] args) {
        
        //System.out.println(distance(3, 7, 2, 8));
       double result = distance(7, 3, 8, 2);
        System.out.printf("The Result is : %.2f\n",result);
    }
}
