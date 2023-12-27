package expressionMethods;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(0);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        int megabytes = kiloBytes / 1024 ;
        int remainingkilobytes = kiloBytes % 1024;

        if (kiloBytes >=0)
            System.out.println(kiloBytes + " KB = " + megabytes +" MB and "+remainingkilobytes+ " KB");
        else
            System.out.println("Invalid Value");
    }
}

