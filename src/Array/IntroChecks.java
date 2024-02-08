package Array;

import java.util.Arrays;

public class IntroChecks {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        int[] objectVariable = array;  /* just created and name in Stack and pointed to Heap o the same object*/
        System.out.println(Arrays.toString(objectVariable));
        objectVariable[1] = 5;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(objectVariable));
    }
}
