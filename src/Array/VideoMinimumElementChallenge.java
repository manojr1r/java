package Array;

import java.util.Arrays;
import java.util.Scanner;

public class VideoMinimumElementChallenge {

       public static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Only numbers with \",\" seperated");
        String  listofIntsWithComma  =  scanner.nextLine();
        String[] stringArray = listofIntsWithComma.split(",");
        int[] intArray = new int[stringArray.length];
        for (int i=0; i < intArray.length; i++ ){
            intArray[i] = Integer.parseInt(stringArray[i].trim());
        }
        return intArray;
    }

    public static int findMin(int[] array ){
//      another approach in src/Array/MinimumElement.java
        /*
        Assume a max no. of Integer is the min an compare
         */
        int minNo = Integer.MAX_VALUE;
        for (int valu : array){
            if (valu < minNo){
                minNo =  valu;
            }
        }
        return minNo;
    }

}
