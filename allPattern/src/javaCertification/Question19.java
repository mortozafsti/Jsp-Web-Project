
package javaCertification;

public class Question19 {
    
    void readCard(int cardNo) throws Exception{
        System.out.println("Reading Card");
    }
    
    void checkCard(int cardNo) throws RuntimeException{ // n1
        System.out.println("Checking Card");
    }
    
    public static void main(String[] args) {
        
        Question19 q = new Question19();
        int cardNo = 12345;
        
        q.checkCard(cardNo);                  //n2
        //q.readCard(cardNo);                  //n3

    }
}
