package ControlFlow.Pattern;

public class TopMIDDLEdown {
    public static void main(String[] args) {
        pattern(5);
    }

    private static void pattern(int n) {
        for (int row = 1; row < (2 * n); row++) {
            int totalColsCount = row > n ? ((2 * n) - row) : row;
            for (int col = 1; col <= totalColsCount; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
