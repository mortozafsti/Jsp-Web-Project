
package javaCertification;

public class CheckingAmount {
    
    public int amount;

    public CheckingAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
    
    public void changeAmount(int x){
        amount += x;
    }
    
    public static void main(String[] args) {
        
        CheckingAmount c1 = new CheckingAmount((int)(Math.random()*100));
        //c1.amount = 0;
        //c1.changeAmount(-c1.amount);
        c1.changeAmount(-c1.getAmount());
        System.out.println(c1.getAmount());
    }
}
