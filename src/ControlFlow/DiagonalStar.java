package ControlFlow;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(4);
    }
    public static void printSquareStar(int number ){
        if (number < 5){
            System.out.print("Invalid Value");
            return;
        }

        for (int row = 1; row <= number; row++){
            for (int col = 1; col <= number; col++) {

                if (row == 1 || row == col || row == number|| col == 1 || col == (number - row +1) || col == number ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}