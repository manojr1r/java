package ControlFlow;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(  isPalindrome(125));
    }
    public static boolean  isPalindrome(int number){

        int original = number, reverse = 0;

        int lastDigit;

        while (number != 0){
            lastDigit = number % 10;
            reverse= reverse*10;
            reverse =  reverse + lastDigit;
            number = number/10;
        }

        return original == reverse;

    }
}
