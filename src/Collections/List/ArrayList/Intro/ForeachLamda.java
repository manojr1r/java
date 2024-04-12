package Collections.List.ArrayList.Intro;

import java.util.ArrayList;
import java.util.List;

public class ForeachLamda {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>(List.of("RajithaSomiReddy","Manoj","Pramod"));
        arrayList.forEach(s -> System.out.println( s + " "));

    }
}
