package AMRself;

public class MethodArguments {


    public static void byteInputFibonacci(int num, int seriesUpto){

        if (seriesUpto<0){
            System.out.print("series should be a greater than zero");
            return;
        }

        if (seriesUpto >= Byte.MAX_VALUE )
        {
            System.out.print("Please enter series in " + Byte.MAX_VALUE +" range");
            return;
        }
        int old  = 1 , temp;
        for (byte i = 0; i < seriesUpto; i++) {

            System.out.println(num);

            temp = num;
            num += old;
            old = temp;




        }
    }
}
