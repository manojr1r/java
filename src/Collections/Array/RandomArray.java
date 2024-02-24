package Collections.Array;

import java.util.Random;

public class RandomArray {
    public static int[] generate(int len){
        Random random = new Random();
        int[] testArray = new int[len];
        for (int i = 0 ; i < len ; i++){
            testArray[i] = random.nextInt(100);
        }
        return testArray;
    }
}
