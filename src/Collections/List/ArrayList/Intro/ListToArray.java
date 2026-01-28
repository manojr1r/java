package Collections.List.ArrayList.Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {

        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("apple");
        fruitsList.add("banana");
        fruitsList.add("mango");

        // -----------------------------
        // 1. List to Array (Recommended)
        // -----------------------------
        String[] array1 = fruitsList.toArray(new String[0]);

        // -----------------------------
        // 2. List to Array (Older style)
        // -----------------------------
        String[] array2 =
                fruitsList.toArray(new String[fruitsList.size()]);

        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));

        System.out.println("Access element: " + array1[0]);
    }
}
