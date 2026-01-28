package Collections.List.ArrayList.Intro.IntroSelfMade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MutabilityDifferences {
    public static void main(String[] args) {

        List<String> asList = Arrays.asList("a", "b");
        List<String> ofList = List.of("x", "y");
        List<String> arrayList = new ArrayList<>(asList);

        asList.set(0, "changed"); // ✅
        // ofList.set(0, "x");    // ❌
        arrayList.add("new");     // ✅

        System.out.println(asList);
        System.out.println(ofList);
        System.out.println(arrayList);
    }
}

