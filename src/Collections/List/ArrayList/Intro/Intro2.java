package Collections.List.ArrayList.Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intro2 {
    public static void main(String[] args) {


        ArrayList<String> arlist1 = new ArrayList<>();
        arlist1.add("Apple");

//        arlist1.addAll("Banana" , "Cherry"); // Won't work, providing direct Elements
//        arlist1.addAll({"Banana" , "Cherry"}); // Won't work
//        ArrayList<String> arList2 = new ArrayList<>("Banana" , "Cherry");  // Won't Work
        ArrayList<String> arrayList0 = new ArrayList<>(List.of("Banana" , "Cherry"));

        arlist1.addAll(arrayList0);
        arlist1.addAll(List.of("Cake" , "Gulab"));
        arlist1.addAll(2, arlist1); // adding same list back will concatenate

arlist1.addAll(Arrays.asList("Biryani","Mandi")); //By Arrays

        System.out.println(arlist1);

    }
}
