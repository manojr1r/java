package ControlFlow;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int factor=0;

        for(int i=1;i<number;i++) {
            if (number % i == 0) {
                factor += i;
            }
        }
           return (factor==number ) ;

    }
}
