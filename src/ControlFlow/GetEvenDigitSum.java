package ControlFlow;

public class GetEvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(25746));
    }

    public static int getEvenDigitSum(int num){
        if (num<0){
            return -1;
        }

        int digit = 0, evenSum =0;

        while (num > 0){
            digit = num % 10;

            if (digit % 2 == 0){
                evenSum += digit;
            }
            num /=10;
        }
        return evenSum;
    }
}
