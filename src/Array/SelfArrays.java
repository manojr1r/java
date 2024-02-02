package Array;

import java.util.Random;

public class SelfArrays {
    public static void main(String[] args) {



    }

    public static int[] getRadomArray( ){
        Random random = new Random();
        int len = random.nextInt(4,10);
        return getRadomArray(len);
    }

    public static int[] getRadomArray( int len ){
        Random random = new Random();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
}
