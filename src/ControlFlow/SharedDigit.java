package ControlFlow;

public class SharedDigit {
    public static void main(String[] args) {

    }
    public static boolean hasSharedDigit(int a, int b){
        if (a <= 10 || a>=100 || b<= 10 ||b >= 100 ){
            return false;
        }

        int firstOne,  secondOne;

        firstOne = a%10;
        a /= 10;
        secondOne = b%10;
        b /= 10;

        return firstOne == b || firstOne == secondOne || a == b || a == secondOne;
    }
}