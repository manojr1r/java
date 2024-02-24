package Collections.Array;

import java.util.Arrays;

public class VideoChalenge {
    public static void main(String[] args) {
        // Sort the Collections.Array in the descending order
        int[] arr = {3,2,0,1};//RandomArray.generate(10);
        System.out.println("Generated "+ Arrays.toString(arr));

//        Arrays.sort(arr);
//        System.out.println("Sorted " + Arrays.toString(arr));
//        int [] reverse =      Reverse.sortAndReverse(arr);
//        System.out.println("sort And Reverse Element values" + Arrays.toString(reverse));
//        System.out.println("Generated "+ Arrays.toString(arr));

        int [] reversed =      Reverse.array(arr);
        System.out.println("Reverse = " + Arrays.toString(reversed));

    }
}
