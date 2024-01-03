package MethodsPractice;

public class DecimalComparator {
    public static void main(String[] args) {
    boolean a = areEqualByThreeDecimalPlaces(3.176,3.175);

        System.out.println( a );
    }

    public static boolean areEqualByThreeDecimalPlaces(double first, double second){

    long firstRounded = (long) (first * 1000);
    long secondRounded = (long) (second * 1000);

    return firstRounded == secondRounded;
    }
}
