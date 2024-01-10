package ControlFlow;

import java.util.IllegalFormatCodePointException;

public class NumberToWords {

    public static void main(String[] args) {
        numberToWords(101);
    }


    public static void numberToWords(int number){
        if (number<0){
            System.out.print("Invalid Value");
        }
        int revNumber = reverse(number);
        System.out.println("rev number"+revNumber);
        int tempNumber = revNumber;
        int lastDigit;
        while (tempNumber != 0){
            lastDigit = tempNumber % 10;


            switch (lastDigit){
                case 0 -> System.out.print("Zero ");
                case 1 -> System.out.print("One ");
                case 2 -> System.out.print("Two ");
                case 3 -> System.out.print("Three ");
                case 4 -> System.out.print("Four ");
                case 5 -> System.out.print("Five ");
                case 6 -> System.out.print("Six ");
                case 7 -> System.out.print("Seven ");
                case 8 -> System.out.print("Eight ");
                case 9 -> System.out.print("Nine ");
            }
            tempNumber /= 10;
        }
        int actCount = getDigitCount(number);

        for (int revCount = getDigitCount(revNumber); number == 0 || revCount < actCount; revCount++) {
                System.out.print("Zero ");
            }


    }
    public static int reverse(int number){
        int lastDigit, reverse =0;  // palindrome same logic
        while (number !=0){
            lastDigit = number % 10;
            reverse *= 10;
            reverse   += lastDigit;
            number   /= 10;

        }
        return reverse;
    }

    public static int getDigitCount(int number){
        // To count the digits in number
        if (number<0){
            return -1;
        }else if(number==0){
            return 1;
        }

        int count =0;
        /*while (number >=9){
            count++;
            number /= 10;
        }*/

        for (int i = 1; i <= number; i *= 10) {
            count++;
        }
        return count;
    }
}
