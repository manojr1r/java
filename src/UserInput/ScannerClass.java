package UserInput;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Scanner scannerFile = new Scanner(new File("ExcelSheet.xlsx"));
        } catch (FileNotFoundException e) {
            System.out.print("File Not Found");
        }
//        scanner.nextLine(); scanner.nextDouble();scanner.next();
    }
}
