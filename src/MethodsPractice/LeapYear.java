package MethodsPractice;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1924));
    }

    public static boolean isLeapYear(int year) {
        boolean leapYear;

        if (year <= 0) {
            leapYear = false;
        }

        if (year > 0 && year < 9999) {
            if (year % 4 == 0) {  // if year is divisible by 4, go to next step.
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        leapYear = true;
                    } else leapYear = false;
                } else leapYear = true;
            } else leapYear = false;
        } else leapYear = false;

        return leapYear;
    }
}

