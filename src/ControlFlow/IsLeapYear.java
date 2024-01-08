package ControlFlow;

public class IsLeapYear {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1,-2000));
        System.out.println(getDaysInMonth(2,2023));
        System.out.println(getDaysInMonth(2,2024));
    }

    public static boolean isLeapYear(int year){
        boolean leapYear = false;

        if ((year>0) && (year<=9999)){
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        leapYear = year % 400 == 0;
                    } else leapYear = true;
                }
        }

return leapYear;

    }
public static int getDaysInMonth(int month,int year){

       if (year < 1 || year> 9999){
           return  -1;
       }

        return switch (month){
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 ->  isLeapYear(year) ?   29 :  28;
            case 4, 6, 9, 11 ->  30;
            default -> -1;
        };
}

}
