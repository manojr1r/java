package ControlFlow;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(0));
        System.out.println(isPerfectNumber(1147));
        System.out.println(isPerfectNumber(33550336));
        System.out.println(isPerfectNumber(8128));
//        System.out.println(  isPerfectNumber(28));
//        System.out.println(isPerfectNumber(5));
//        System.out.println(isPerfectNumber(-1));
    }
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int factorSum=0;

        for(int i=1;i < number; i++) {
            if (number % i == 0) {
                factorSum += i;
            }
        }
           return factorSum==number ;

    }
}
