package UserInput;
import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }
    public static void inputThenPrintSumAndAverage(){
        int sum = 0 ; long avg  = 0; int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Please Enter Input");
                long input = scanner.nextLong();
                count++;
                sum += (int) input;
                avg = Math.round ( (double) sum / count);

            } catch (Exception e) {
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
        }
    }
}
