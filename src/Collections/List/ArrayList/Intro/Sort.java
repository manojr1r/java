package Collections.List.ArrayList.Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(List.of("Banana" , "Cherry"));
        arrayList.addAll(List.of("Cake", "Gulab"));
        arrayList.addAll(Arrays.asList("Biryani", "Mandi"));

        System.out.println(arrayList);

        arrayList.sort(Comparator.naturalOrder());

        System.out.println(arrayList);
        arrayList.sort(Comparator.reverseOrder());
        System.out.println(arrayList);
    }
}
