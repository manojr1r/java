package Collections.Array.TwoDimensionalArrays;

import java.util.Arrays;

public class Intro2 {
    public static void main(String[] args) {
        int[][] arr =  new int[3][];  //fixed length but no width Collections.Array

        int[][] arr1 =  { /*created and */
                {1,2,3},
                {4,5}
        };
        System.out.println("Created Int but no width " + Arrays.deepToString(arr));
        System.out.println("Created and Initiated " + Arrays.deepToString(arr1));

        arr[1]  = new int[] {1};
        System.out.println("Assigned INT " +Arrays.deepToString(arr));

        arr[2]  = new int[] {2,4};
        System.out.println("Assigned 2nd time "+Arrays.deepToString(arr));

    }
}
