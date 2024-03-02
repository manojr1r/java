package Collections.Iterator;
import java.util.*;

import static Collections.List.ArrayList.Intro.Intro2.addArrayList;
import static Collections.List.LinkedList.Add.addingTypes;
public class Main {
    public static void main(String[] args) {
        var linkedList = new LinkedList<String>();
        addingTypes(linkedList);
        var arrayList = new ArrayList<String>();
        addArrayList(arrayList);

        listIterator(arrayList);
        listIterator(linkedList);

        iteratorOnly(arrayList);
        iteratorOnly(linkedList);
    }

    public static void iteratorOnly(List<String> list) {
        Iterator<String> iterator = list.iterator();
        System.out.println();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
//            iterator.previous();   // method doesn't support for iterator type
            if (iterator.next().equals("Banana")) {
                System.out.printf("%nFound Banana%n");
            }
        }
//        iterator = list.iterator(1);      // this doesn't support in Iterator
    }

    public static void listIterator(List<String> list) {

        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
//            iterator.hasPrevious();
            iterator.previous();
            if (iterator.next().equals("Banana")) {
                System.out.printf("%nFound Banana%n");
            }

        }
        System.out.println();
        iterator = list.listIterator(0);            // Moved to 0 index, can use any No. as index.
        System.out.println("moved to 0 Index " + iterator.next());
    }

}
