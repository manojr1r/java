package Collections.List.ArrayList.Intro.IntroSelfMade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListBasics {
    public static void main(String[] args) {

        String[] fruits = {"apple", "banana"};

        List<String> fixedSize = Arrays.asList(fruits); // set only
        List<String> immutable = List.of(fruits);       // no modification
        List<String> mutable = new ArrayList<>(List.of(fruits)); // best

        System.out.println(fixedSize);
        System.out.println(immutable);
        System.out.println(mutable);
    }
}