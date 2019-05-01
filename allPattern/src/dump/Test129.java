package dump;
public class Test129 {
    int a1;
    public static Integer doStuff(Integer a) {
        a = a * a;
        return a;
    }
    public static void doString(StringBuilder s) {
        s.append(" " + s);
    }
    public static void main(String[] args) {
        Test129 item = new Test129();
        item.a1 = 11;

        StringBuilder sb = new StringBuilder("Hello");
        Integer i = 10;
        doStuff(i);
        doString(sb);
        doStuff(item.a1);
        System.out.println(i + " " + sb + " " + item.a1);
    }
}
