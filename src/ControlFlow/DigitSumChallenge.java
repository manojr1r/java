package ControlFlow;

public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println( sumDigit(-11));

    }
public static int sumDigit(int number){
        if (number<0){
            return -1;
    }
    int lastDigit;
    int sum =0;
    /*
    while (number != 0){
        lastDigit = number % 10;   // To extract last digit of a number
             sum += lastDigit;
             number = number/10;      // To remove last digit of the number
        }
     */

    while (number > 9){
        lastDigit = number % 10;    // To extract last digit of a number
        sum += lastDigit;
        number = number/10;         // To remove last digit of the number
    } sum += number;                // As we take greater than 9 need to add the remaing digit here

    return sum;
}

}
