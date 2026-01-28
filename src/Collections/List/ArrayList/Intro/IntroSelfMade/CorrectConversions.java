package Collections.List.ArrayList.Intro.IntroSelfMade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CorrectConversions {
    public static void main(String[] args) {

        String[] fruits = {"apple", "banana"};

        List<String> list = new ArrayList<>(List.of(fruits));

        list.add("mango");
        list.addAll(Arrays.asList(fruits));

        // list.addAll(fruits); // ❌ not a Collection

        System.out.println(list);
    }
}

