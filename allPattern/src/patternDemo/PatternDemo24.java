package patternDemo;

public class PatternDemo24 {

    public static void main(String[] args) {
        int row = 4, col = 7;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || j == 0 || i == row - 1 || j == col - 1) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println("");
        }
    }
}
