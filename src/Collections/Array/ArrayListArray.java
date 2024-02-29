package Collections.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListArray {
    public static void main(String[] args) {
        ArrayList<String> arrayList =  new ArrayList<>(Arrays.asList("Hello", "World", "List"));
        String[] fruitArray1 = arrayList.toArray(new String[0]);
    }
}
