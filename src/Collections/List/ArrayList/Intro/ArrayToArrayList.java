package Collections.List.ArrayList.Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {

        String[] fruitsArray = {"apple", "banna"};

        List<String> fruitsList1 = new ArrayList<>();
        System.out.println(fruitsList1);
        fruitsList1.addAll(Arrays.asList("Biryani", "Mandi")); // ✅ works
        System.out.println(fruitsList1);


//from Arrays to List -> Immutable

        List<String> fruitsList = List.of(fruitsArray); //creates an immutable list.

//fruitsList.addAll(Arrays.asList("Biryani","Mandi")); /*so this will not work*/

        System.out.println("used List.of({array}) to convert Array to ArrayList, this will return ImmutableCollections$List" + fruitsList.getClass().getName());

        List<String> fruitsList2 = new ArrayList<>();
        fruitsList2.addAll(Arrays.asList("Biryani","Mandi"));

        fruitsList2.addAll(List.of(fruitsArray));

//From Array to ArrayList
        //using List.of on Arrays while initializing
        ArrayList<String> fruitsArraysList = new ArrayList<>(fruitsList);

        System.out.println("after adding to List by Arrays.asList, and added List to ArrayList = " + fruitsArraysList);

        fruitsArraysList.addAll(List.of(fruitsArray));
        fruitsArraysList.addAll(fruitsList); //As it is a List direct addAll
        fruitsArraysList.addAll(fruitsList);
        //fruitsArraysList.addAll(fruitsArray);   //parameter value  is Array, this will not work.
        fruitsArraysList.addAll(Arrays.asList(fruitsArray));  //using Arrays.asList
        System.out.println("fruitsArraysList = " + fruitsArraysList);

        /* Arrays.asList()  List.of()
         *     Arrays.asList(), was introduced in Java 1.2,  mutable
         *     List.of()  Java 9   Doesn't allow 'null' -> NullPointerException   unmodifiable
         */


//  from ArrayList to Array
        //this is one method add
        String[] fruitArray = fruitsArraysList.toArray(new String[fruitsArraysList.size()]);
        String[] fruitArray1 = fruitsArraysList.toArray(new String[0]);

        System.out.println(Arrays.toString(fruitArray));
        System.out.println(Arrays.toString(fruitArray1));
        System.out.println("Array get, fruitArray[0] =" + fruitArray[0]);

    }
}
