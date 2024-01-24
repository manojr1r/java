package ControlFlow;

public class DayOfWeekEnchancedSwitch {
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

         String weekDay = switch (day) {
            case 0 -> ("Sunday");
            case 1 -> "Monday";
            case 2 ->{ yield  "Tuesday";}
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default ->{
                String valu = "Invalid Day";
                yield valu;} // if you want to compute (or || &) assign a value, and return at last need to use "yield" key
        };
    return day + " Stands for " +weekDay;
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
