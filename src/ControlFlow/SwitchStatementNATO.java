package ControlFlow;

public class SwitchStatementNATO {
    public static void main(String[] args) {

        System.out.println(dayOfWeek(0));
        System.out.println(dayOfWeek(1));
        System.out.println(dayOfWeek(2));
        System.out.println(dayOfWeek(3));
        System.out.println(dayOfWeek(4));
        System.out.println(dayOfWeek(5));
        System.out.println(dayOfWeek(6));
        System.out.println(dayOfWeek(9));
    }
    public static String dayOfWeek(int day){

        return switch (day) {
            case 0 -> day + " = Sunday";
            case 1 -> day + " = Monday";
            case 2 -> day + " = Tuesday";
            case 3 -> day + " = Wednesday";
            case 4 -> day + " = Thursday";
            case 5 -> day + " = Friday";
            case 6 -> day + " = Saturday";
            default -> day + " = Invalid Day";
        };

    }
    public static String  printWeekDay(int day){
        if (day == 0) return "Sunday";
        else if (day == 1) return  "Monday";
        else if (day == 2) return "Tuesday";
        else if (day == 3) return "Wednesday";
        else if (day == 4) return "Thursday";
        else if (day == 5) return "Friday";
        else if (day == 6) return "Saturday";
        else return  "Invalid Day";
    }
}
