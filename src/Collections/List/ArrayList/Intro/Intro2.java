package Collections.List.ArrayList.Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intro2 {
    public static void main(String[] args) {


        ArrayList<String> arlist1 = new ArrayList<>();
        System.out.println(arlist1);
    }
    public static void addArrayList(ArrayList<String> list){
        list.add("Apple");

//        list.addAll("Banana" , "Cherry"); // Won't work, providing direct Elements
//        list.addAll({"Banana" , "Cherry"}); // Won't work
//        ArrayList<String> arList2 = new ArrayList<>("Banana" , "Cherry");  // Won't Work
        ArrayList<String> arrayList0 = new ArrayList<>(List.of("Biryani" , "Cherry"));

        list.addAll(arrayList0);
        list.addAll(List.of("Cake" , "Gulab"));
        list.addAll(2, list); // adding same list back will concatenate

        list.addAll(Arrays.asList("Banana","Mandi")); //By Arrays

    }
}
