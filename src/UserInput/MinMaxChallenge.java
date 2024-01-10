package UserInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double min = 0 , max =0 ;
        int loopCount = 0;


        while (true) {
            try {
                double input = scanner.nextDouble();
                if(input < min  || loopCount == 0){
                    min = input;
                }
                if (input > max || loopCount == 0){
                    max = input;
                }
                loopCount++;
            } catch (InputMismatchException fe) {
                break;
            }
        }

        if (loopCount > 0){
            System.out.println("The Max no. among entered no's is " + max);
            System.out.println("The minimum no. among entered no's is " + min);
        }else {
            System.out.println("No Valid no. is entered");
        }
    }
}
