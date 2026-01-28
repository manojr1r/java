package Collections.List.ArrayList.Intro;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

    public static void main(String[] args) {

        // -------------------------------------------------
        // 1. Create an Array
        // -------------------------------------------------
        String[] fruitsArray = {"apple", "banana"};

        // -------------------------------------------------
        // 2. Plain ArrayList (Fully Mutable) same 5.) just List.of is used in Constructor
        // -------------------------------------------------
        // ✅ add(), remove(), set() all work
        List<String> mutableList = new ArrayList<>();

        mutableList.add("apple");
        mutableList.add("banana");
        System.out.println("Mutable ArrayList: " + mutableList);


        // -------------------------------------------------
        // 3. Arrays.asList() → Fixed-size List
        // -------------------------------------------------
        // ❌ add() / remove()
        // ✅ set()
        // Backed by the original array
        List<String> fixedSizeList = Arrays.asList(fruitsArray);

        System.out.println("\nArrays.asList(): " + fixedSizeList);
        System.out.println("Class: " + fixedSizeList.getClass().getName());

        // fixedSizeList.add("orange"); // ❌ UnsupportedOperationException
        fixedSizeList.set(0, "mango");   // ✅ allowed

        System.out.println("After set(): " + fixedSizeList);
        System.out.println("Array also changed: " + Arrays.toString(fruitsArray));


        // -------------------------------------------------
        // 4. List.of() → Immutable List (Java 9+)
        // -------------------------------------------------
        // ❌ add()
        // ❌ remove()
        // ❌ set()
        List<String> immutableList = List.of(fruitsArray);

        System.out.println("\nList.of(): " + immutableList);
        System.out.println("Class: " + immutableList.getClass().getName());

        // immutableList.add("orange"); // ❌
        // immutableList.set(0, "mango"); // ❌


        // -------------------------------------------------
        // 5. Correct Way: Get a Modifiable List from an Array
        // -------------------------------------------------
        // ✅ Most recommended approach
        List<String> modifiableList = new ArrayList<>(List.of(fruitsArray));
        //  🧠 “I am creating a list and pre-filling it with array data.”
        modifiableList.add("biryani");
        modifiableList.addAll(Arrays.asList(fruitsArray));
        modifiableList.add("biryani 2");

        System.out.println("\nModifiable List: " + modifiableList);


        // -------------------------------------------------
        // 6. addAll() Rules
        // -------------------------------------------------
        modifiableList.addAll(Arrays.asList(fruitsArray)); // ✅ Collection required

        // modifiableList.addAll(fruitsArray); // ❌ Array is NOT a Collection

        System.out.println("Final modifiableList: " + modifiableList);
    }
}
