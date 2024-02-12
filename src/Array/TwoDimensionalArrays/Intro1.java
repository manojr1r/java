package Array.TwoDimensionalArrays;

import java.util.Arrays;

public class Intro1 {
    public static void main(String[] args) {
        int[][] arr =  new int[2][2]; //fixed length and width Array
        arr[0][0] = 1 ;
        arr[1][1] = 6 ;
        /*
        Even though we have initialized 2 * 2
            Not restricted as such only assigned only one
         */
        System.out.println("Deep To String = "+Arrays.deepToString(arr));
        arr[1] = new int[] {1};
        /*
        We can't use Anonymous array
        arr = {
                 {1, 2}, {2, 3}
         };
         */

        System.out.println("new Array = "+Arrays.deepToString(arr));


    }
}
