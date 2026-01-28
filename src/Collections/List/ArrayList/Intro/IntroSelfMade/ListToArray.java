package Collections.List.ArrayList.Intro.IntroSelfMade;

import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {

        List<String> list = List.of("apple", "banana", "mango");

        String[] array1 = list.toArray(new String[0]);
        //old way
        String[] array2 = list.toArray(new String[list.size()]);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}

