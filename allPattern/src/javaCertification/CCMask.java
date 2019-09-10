
package javaCertification;

public class CCMask {
    
    public static void main(String[] args) {
        
        System.out.println(maskCC("1234-5678-1234-1567")); 
        
    }
    
    public static String maskCC(String creditCard){
        
        String x = "xxxx-xxxx-xxxx-";
        
        //return x+creditCard.substring(15, 19);
        
        StringBuilder sb = new StringBuilder(x);
        sb.append(creditCard,15,19); 
        return sb.toString();
        
    } 
    
}
