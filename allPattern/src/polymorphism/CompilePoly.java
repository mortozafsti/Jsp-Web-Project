package polymorphism;

public class CompilePoly {

    public void disp(int number) {
        System.out.println("Method: " + number);
    }

    public void disp(int number1, int number2) {
        System.out.println("Method: " + number1 + ", " + number2);
    }
     public double disp(double number){
        System.out.println("Method: "+number);
        return number;
    }
}
class CompileTimePolymorphismDemo{
    public static void main(String[] args) {
        CompilePoly cp = new CompilePoly();
        cp.disp(20);
        cp.disp(30, 40);
        double res = cp.disp(5.1);
        System.out.println(res);
    }
}
