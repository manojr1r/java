package ControlFlow.Pattern;

public class Rhombus {
    public static void main(String[] args) {
        pattern(5);
    }

    private static void pattern(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? ((2 * n) - row) : row;
            int spacesNeeded = n - totalColsInRow;
            for (int space = 1; space <= spacesNeeded; space++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
