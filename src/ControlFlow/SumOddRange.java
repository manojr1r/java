package ControlFlow;

public class SumOddRange {
    public static void main(String[] args) {
        System.out.println( sumOdd(1, 11));
    }

    public static boolean isOdd(int number) {
        /*if (number < 0) {
            return false;
        } else {
            return  (number % 2 != 0) ;
        }*/
        return number < 0 && number % 2 !=0;
    }
    public static int sumOdd(int start, int end) {

        if (start < 0 || end < 0 || end < start) {
            return -1;
        } else {
            int sum =0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }
    }
}
