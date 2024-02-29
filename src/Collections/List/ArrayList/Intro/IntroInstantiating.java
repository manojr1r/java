package Collections.List.ArrayList.Intro;

import java.util.ArrayList;
import java.util.List;

public class IntroInstantiating {

    public static void main(String[] args) {
        String[] array = {"Apple", "Oranges", "Grapes"};  //Array
//    List<String> list = new List<String>() ;  // Unable to instantiate as it is a Interface
        List<String> list = List.of(array);

        System.out.println( "List.of class " + list.getClass().getName());
        //As this "List" is a Immutable we CANNOT add, set.,
        System.out.println( list.indexOf("Oranges"));

        List<String> arrayList1 = new ArrayList<>(); // Interface
        System.out.println("List Interface "+ arrayList1.getClass().getName());
        ArrayList arrayList0 = new ArrayList(); // Raw instantiating, without Generics
        System.out.println("ArrayList Interface "+ arrayList0.getClass().getName());
        ArrayList<String> arrayList00 = new ArrayList();  // Still Raw instantiating as no dimond operator on the Right
        ArrayList<String> arrayList2 = new ArrayList<>();
        System.out.println("ArrayList with Generics "+ arrayList2.getClass().getName());
        ArrayList<String> arrayList = new ArrayList<>(List.of(array));
        System.out.println(arrayList);
        arrayList.add("Banana");
        System.out.println(arrayList);

    }

}
