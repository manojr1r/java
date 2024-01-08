package MethodsPractice;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1924));
    }

    public static boolean isLeapYear(int year) {
        boolean leapYear = false;

        if (year > 0 && year < 9999){
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    leapYear = year % 400 == 0;
                } else leapYear = true;
            }
        }

        return leapYear;
    }
}

