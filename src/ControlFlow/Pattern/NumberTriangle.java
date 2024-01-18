package ControlFlow.Pattern;

public class NumberTriangle {
    public static void main(String[] args) {
        pattern(5);
    }
    private static void pattern(int n){
        for (int row = 1; row <= n; row++) {

            for (int space = 0; space < n- row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int after = 2; after <= row; after++) {
                System.out.print(after + " ");
            }
            System.out.println();
        }
    }
}
