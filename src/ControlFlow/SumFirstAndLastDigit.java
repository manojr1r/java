package ControlFlow;

public class SumFirstAndLastDigit {
    public static void main(String[] args) {
        System.out.println( sumFirstAndLastDigit(6));
    }
    public static int sumFirstAndLastDigit(int num){
        if (num<0){
            return -1;
        }

        /*int lastdigit = 0;

        if (num <9){
            num = num + num;
        }

        else if (num>9){
            lastdigit = num % 10;
            while (num>9) {
                num /= 10;
                if (num<10) {
                    break;
                }
            }
        }
         */
        int lastdigit = num %10;

        while (num>9){
            num /= 10;
        }

        return lastdigit + num;

    }
}
