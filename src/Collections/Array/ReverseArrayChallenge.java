package Collections.Array;

import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reversed = "+Arrays.toString(arr));
    }

    public static void reverse(int[] arr){

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length -1 - i];
            arr[arr.length -1 - i] = temp;
        }
    }
}
