package Collections.Array.TwoDimensionalArrays;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        Object[] arr =  new Object[3];
        System.out.println("Created Single Dimensional OBJECT Collections.Array = "+ Arrays.deepToString(arr));

        arr[0]  = new int[] {1};
        System.out.println("Assigned " + Arrays.deepToString(arr));

        arr[1]  = new String[][] {{"Two"},{"Dimension"}};
        System.out.println("Assigned 2nd time String two dimension " + Arrays.deepToString(arr));

        arr[2]  = new int[3][][];
        System.out.println("Assigned 3rd time " + Arrays.deepToString(arr));
    }
}
