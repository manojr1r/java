package UserInput;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.Year;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {
        /*
        Scanner doesn't support prompt text
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi What's your name? ");
        String name = scanner.nextLine();
        int dob  ;
        /*
        while (true) {
            try {
                System.out.println("What's your date of birth ");
                 dob  = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Enter Valid date of birth ");
                scanner.next();
            }
        }
        */
        do {
            try {
                System.out.println("What's your date of birth " + scanner.hasNextInt());
                dob = scanner.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("Please enter Valid date of Year ");
                scanner.next();
            }
        }while (/*!(scanner.hasNextInt())*/true );

        scanner.close();
        System.out.print("Hi "+name + (Year.now().getValue() - dob )+ " year's");

        //''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
        /*
        for files reading!!
         */
        try {
            Scanner scannerFile = new Scanner(new File("ExcelSheet.xlsx"));
            scannerFile.close();
        } catch (FileNotFoundException e) {
            System.out.print("File Not Found");
        }
//        scanner.nextLine(); scanner.nextDouble();scanner.next();
    }
}
