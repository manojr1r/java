import java.util.Arrays;
import java.util.Random;

public class RandomChecks {
    public static void main(String[] args) {
        int[] a = {5};
//        System.out.println(Arrays.toString(a));
        Object object = a;
//        System.out.println(Arrays.toString(object));

        getArray(5);
    }
    public static void getArray( int len){
        Random random = new Random();
        int[] arr = new int[len];

        System.out.println(Arrays.toString(arr));
    }
}
