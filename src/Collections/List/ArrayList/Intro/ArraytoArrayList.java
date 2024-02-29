package Collections.List.ArrayList.Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraytoArrayList {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(List.of( "Apple"));
//  From Array to ArrayList
        arrayList.addAll(Arrays.asList("Biryani","Mandi"));
        ArrayList<String> fruitList = new ArrayList<>(Arrays.asList("Biryani","Mandi"));
        /* Arrays.asList()  List.of()
        *     Arrays.asList(), was introduced in Java 1.2,  mutable
        *     List.of()  Java 9   Doesn't allow 'null' -> NullPointerException   unmodifiable
         */

//        System.out.println(arrayList);
//        System.out.println( "List get, fruitList.get(0) =" + fruitList.get(0));

//  from ArrayList to Array
        String[] fruitArray = arrayList.toArray( new String[arrayList.size()]);
        String[] fruitArray1 = arrayList.toArray(new String[0]);


        System.out.println(Arrays.toString(fruitArray));
        System.out.println(Arrays.toString(fruitArray1));
        System.out.println( "Array get, fruitArray[0] =" + fruitArray[0]);

    }
}
