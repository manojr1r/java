package Collections.List.ArrayList.Intro.IntroSelfMade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListRemovePract {

    public static void main(String[] args) {

        List<String> fruitsList = new ArrayList<>(List.of("apple", "milk", "grapes", "milk"));
        System.out.println(fruitsList);
        List<String> non_fruits = new ArrayList<>(Arrays.asList("milk", "butter"));

        // will removeAll all with duplicates?
        fruitsList.removeAll(non_fruits);
        System.out.println("removed = " +fruitsList);
        System.out.println("In fruitsList 'milk' it got removed all the values");
    }


}
