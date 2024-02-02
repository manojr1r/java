package Array;

import java.util.Random;

public class Test {
    public int[] array(int len){
        Random random = new Random();
        int[] testArray = new int[len];
        for (int i = 0 ; i < len ; i++){
            testArray[i] = random.nextInt(100);
        }
        return testArray;
    }
}
