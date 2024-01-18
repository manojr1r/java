package ControlFlow.Pattern;

public class TopDown {
    public static void main(String[] args) {
    pattern(5);
    }
    private static void pattern(int n) {
        for (int row = 1; row <=n; row++) {
            for (int j = 1; j <= (n+1)-row; j++) { //int j = 5; j >= row; j--
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
