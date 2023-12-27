package expressionMethods;

public class speedConverter {
    public static void main(String[] args) {
        printConversion(25.42);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            long milesPerHour = Math.round(kilometersPerHour / 1.609);
            return milesPerHour;
        }
    }
        public static void printConversion(double kilometersPerHour){
        long milesPerHour = toMilesPerHour(kilometersPerHour);

        System.out.println(milesPerHour>=0 ? (kilometersPerHour + "km/h = " + milesPerHour + " mi/h") : "Invalid Value" );
        }
}

