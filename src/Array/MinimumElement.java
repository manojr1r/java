package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Array size, needs to enter number that many times");
        return   scanner.nextInt();
    }

    private static int[] readElements(int size ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter no. of your choice ");

        int[] intArray = new int[size];
        for (int i=0; i < intArray.length; i++ ){
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }

    private static int findMin(int[] array ){
//        another approach in src/Array/VideoMinimumElementChallenge.java
        Arrays.sort(array);
        return array[0];
    }

}
