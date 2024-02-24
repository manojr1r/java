package Collections.Array;

import java.util.Arrays;

public class Intro2 {
    public static void main(String[] args) {
        int [] array1 = {-6, 8,7};
        Object obIns = array1;  //assigning array instance to Object instance
        if (obIns instanceof int[]){
            System.out.println("assigned int array to Object array to Object instance\n");
        }
        /*  This below is Object array
        * Which means can save any type of data type data
        * this method is "NOT-SUGGESTED" though*/
        Object[] objectArray = new Object[3];
        objectArray[0] = "array";
        objectArray[1] = Arrays.toString( array1);
        objectArray[2] = 9;

        System.out.println(Arrays.toString(objectArray));
    }
}
