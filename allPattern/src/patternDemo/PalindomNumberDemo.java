package patternDemo;

public class PalindomNumberDemo {

    public static void main(String[] args) {

        int num = 11;
        int sum = 0;
        int r;
        int temp = num;
        
        while (temp != 0) {
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
        }
        if (num == sum) {
            System.out.println(num+" is Palindom Number");
        }else{
            System.out.println(num+" is Not Palindom Number");
        }
        

    }

}
