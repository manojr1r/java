package ControlFlow;

public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println( sumDigit(100));

    }
public static int sumDigit(int num){
        if (num<0){
            return -1;
    }
    int lastDigit;
    int sum =0;
    while (num !=0){
        lastDigit = num % 10;   // To extract last digit of a number
             sum += lastDigit;
             num = num/10;      // To remove last digit of the number
        }
    return sum;
}

}
