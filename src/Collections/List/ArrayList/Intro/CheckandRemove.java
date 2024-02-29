package Collections.List.ArrayList.Intro;

import java.util.ArrayList;
import java.util.List;

public class CheckandRemove {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(List.of( "Apple", "Banana", "Cherry", "Cauliflower", "Spinach","Beans", "Mango", "Pears"));
        ArrayList<String> fruits = new ArrayList<>(List.of( "Apple", "Cherry", "Apple"));

        if (arrayList.contains("Apple")){ // Will return true or false
            System.out.println("List contains Apple");
        }
        if (arrayList.containsAll(fruits)) {
            System.out.println("Checking in Arraylist");
        }  //big list returns true(Period)
        if (fruits.containsAll(arrayList)) {
            System.out.print("Checking in Fruits");
        }

        System.out.println("Apple index " + arrayList.indexOf("Apple"));
        System.out.println("Apple Last index " + arrayList.lastIndexOf("Apple"));

        arrayList.addAll(List.of("Apple", "Apple"));
        System.out.println("Before removing "+ arrayList);
// Will remove only one occurrence
        arrayList.remove(0);
        arrayList.remove("Banana");

        arrayList.removeAll(List.of("Apple" , "Banana")); //will remove all occurrences
        System.out.println("After removing"+ arrayList);

        arrayList.retainAll(fruits);  // will remove rest expect which are in the list
        System.out.printf("Retain only fruits list the rest removed%n %s %n", fruits);

        arrayList.clear();  // will wipe out
        System.out.println("is Empty? "  + arrayList.isEmpty());
    }
}
