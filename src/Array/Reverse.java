package Array;

import java.util.Arrays;

public class Reverse {
    public static int[] array(int[] input) {
        int[] reverse = Arrays.copyOf(input, input.length);
        boolean flag = true;

        while (flag) {
            flag = false;
            for (int i = 0; i < reverse.length - 1; i++) {
                if (reverse[i] < reverse[i + 1]) {
                    int temp = reverse[i];
                    reverse[i ] = reverse[i + 1];
                    reverse[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return reverse;
    }


    public static int[] sortAndReverse(int[] input){
//        sort And Reverse Element values
        int [] sortedReverse = Arrays.copyOf(input, input.length);
        Arrays.sort(sortedReverse);
        System.out.println("Sorted " + Arrays.toString(input));

        for (int  i = (input.length - 1); i >= 0 ; i-- ){
            sortedReverse[input.length -1 -i] = input [i];
        }
        return sortedReverse;
    }


}
