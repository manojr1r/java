package Collections.List.ArrayList.Intro.IntroSelfMade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListBasics {
    public static void main(String[] args) {

        String[] fruits = {"apple", "banana"};

        List<String> fixedSize = Arrays.asList(fruits); // set only
        List<String> immutable = List.of(fruits);       // no modification
        // (Java 9+)
        List<String> mutable = new ArrayList<>(List.of(fruits)); // best or
        List<String> mutableWithArray = new ArrayList<>(Arrays.asList(fruits));

        System.out.println(fixedSize);
        System.out.println(immutable);
        System.out.println(mutable);
        System.out.println(mutableWithArray);

        System.out.println("\n" + "*****".repeat(7) + "\n");

        List<String> fruits2 = List.of("apple", "banana");

        List<String> mutable2 = new ArrayList<>((fruits2));// as it is already List.of no need here again
        System.out.println("mutable2 = " + mutable2);
        for (String fruit : mutable2){
            System.out.println(fruit);
        }

    }
}