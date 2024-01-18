package ControlFlow;

public class LargestPrimeTim {
    public static void main(String[] args) {
//        System.out.println("7 "+getLargestPrime (3));
//        System.out.println("7 "+getLargestPrime(21));
        System.out.println("31 "+getLargestPrime (248));
    }

    public static int getLargestPrime(int number){
        if (number <= 2){
            if (number == 2){
                return 2;
            }
            return -1;
        }
        int factor = -1 , unique = 0;;
        for(int divisior =2; divisior<= Math.sqrt(number); divisior++) { //largest prime factor of a number cannot exceed its square root.

            if (number % divisior != 0) {
                continue;
            /*    unique++;
                if (unique == 1 && divisior == number) {
                    System.out.println("Second if " + unique);
                    factor = divisior;
                } else if (unique >1 ) {
                    if  ( divisior==number){
                        continue;
                    }
                    factor = divisior;
             */
            }
            factor = divisior;
            while (number % divisior == 0) {
                number /= divisior;
            }
        }
        return number == 1 ? factor : number;
    }

}
