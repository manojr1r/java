import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter =0;
        int sum = 0;
        do {
            System.out.println("Enter number #X: ");
            String inputNumber =scanner.nextLine();
            try {
                int number = Integer.parseInt(inputNumber);
                sum += number;
                counter++;
            }
            catch (NumberFormatException numberformat){
                System.out.println("Invalid number");

            }
        }while (counter<5);
        System.out.println("The sum of 5 numbers you entered is " + sum );
    }
}
