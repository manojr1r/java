package ControlFlow;

public class HasSameLastDigit {
    public static void main(String[] args) {
        System.out.println( hasSameLastDigit(28,99,19));

    }
    public static boolean isValid(int num){
        return (num >= 10 && num <= 1000);
    }
    public static boolean hasSameLastDigit(int a, int b, int c){

        if (!isValid(a) || !isValid(b) || !isValid(c)){
            return false;
        }
        int one = a % 10;
        int two = b % 10;
        int three = c % 10;

        return one == two || one == three || two == three ;
    }
}
