package UserInput;
import java.time.Year;

public class SystemConsole {
    public static void main(String[] args) {
//        All inputs are in string format then need to change to required format
        /*
        System Console doesn't run from RUN directly have to initiate from terminal
         */
        System.out.println(getInputfromScanner());
    }
    public static String getInputfromScanner(){

        String name = System.console().readLine("Hi What's your name? ");
        String year = System.console().readLine("What's your date of birth ");
        int age;
        while (true) {
            try {
                Integer.parseInt(year);
                break;
            } catch (Exception notAnIneger) {
                year = System.console().readLine("Please enter Valid date of birth ");
            }
        }
        age = Year.now().getValue() - Integer.parseInt(year);
        return "hi "+ name +", Your Age is "+ age + " Year's, It's just not a number!!";
    }
}
