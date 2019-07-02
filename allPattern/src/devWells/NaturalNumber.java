package devWells;

public class NaturalNumber {

    public static void main(String[] args) {

//        int n = 50;
//        System.out.println(nnumber(n));
        nnumber(0);
        return;

    }

    public static int nnumber(int n) {

        if (n > 50) {
            return 0;
        }
        System.out.print(n + " ");
        return nnumber(n + 1);

    }
}
