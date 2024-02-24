package Collections.Array.TwoDimensionalArrays;

import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {
        int[][] arr =  new int[3][3]; //fixed length and width Collections.Array

        arr[0][0] = 1 ;
        arr[2][2] = 6 ;
        System.out.println("Deep To String = "+Arrays.deepToString(arr));

        for (int i = 0 ; i < arr.length; i++){ //Assigning Values
            var ar = arr[i];
            for (int j = 0; j< ar.length ; j++ ){
                 arr[i][j]  = i*10 + j+1;
            }
        }

        for (int i = 0 ; i < arr.length; i++){ //Assigning Values
            for (int j = 0; j< arr[i].length ; j++ ){
                arr[i][j]  = i*10 + j+1;
            }
        }


//      Enhanced // For each loop
        for (int[] ar : arr){ //extracting Collections.Array from Two Dimensional Collections.Array
            System.out.println(Arrays.toString(ar));
        }

//      For each loop
        for (int[] ar : arr){ //extracting Collections.Array from Two Dimensional Collections.Array
            for (int a : ar){
                System.out.print(a+" ");
            }
            System.out.println();
        }

    }
}
