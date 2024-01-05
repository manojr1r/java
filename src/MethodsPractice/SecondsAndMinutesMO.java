package MethodsPractice;

public class SecondsAndMinutesMO {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString (-65,45));
        System.out.println(getDurationString (-65,145));
    }
    public static String getDurationString(int seconds) {
        if (seconds<0){
            return "Please enter correct time format ";
        }else {
            int hours = seconds / 3600;
            int remainingMins = seconds % 3600;
            int mins = remainingMins / 60 ;
            int remaingSeconds = seconds % 60;

            return hours+"h "+ mins+"m "+ remaingSeconds+"s";
        }
    }

    public static String getDurationString(int minutes,int seconds) {
        if (minutes>0 && seconds>0 && seconds<=60) {
            int secoundsFromMins = minutes * 60;
            int totalSecounds = secoundsFromMins + seconds;
            return getDurationString(totalSecounds);
        }else{
            return "Please enter correct time format ";
        }
    }
}
