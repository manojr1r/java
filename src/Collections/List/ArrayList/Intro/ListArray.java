package Collections.List.ArrayList.Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArray {
    public static void main(String[] args) {
        /* Arrays.asList()  List.of()
         *     Arrays.asList(), was introduced in Java 1.2,  mutable
         *     List.of()  Java 9   Doesn't allow 'null' -> NullPointerException   unmodifiable
         */

        List<String> array = Arrays.asList("Array", "check", "Muttable");
        List<String> list = List.of("list", "Sunday", "Monday");

        ArrayList<String> arrayList =  new ArrayList<>(Arrays.asList("Array", "check", "Muttable"));
        String[] fruitArray1 = arrayList.toArray(new String[0]);

        array.set(0, "ArrayChanged");
        try {
            list.set(0, "ChangedList");
        }catch (Exception e){
            System.out.println("List.of() is un-mutable");
        }

        System.out.println(array);
        System.out.println(list);


    }
}
