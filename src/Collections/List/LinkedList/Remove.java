package Collections.List.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Remove {
    public static void removeTypes(LinkedList<String> list){
        String value= list.remove(); // Removes first element, which method isn't in Arraylist
        System.out.println("Removed " + value);
        value = list.remove(3);
        System.out.println("Removed " + value);
        list.remove("Paris");  //Value can't be assigned.
        System.out.println(list);
        value = list.removeFirst();
        System.out.println("Removed First " + value);
        value = list.removeLast();
        System.out.println("Removed Last " + value);

        // Queue/ dequeue Poll methods
        String p1 = list.poll(); // Removes first element
        System.out.println("Poll remove " + p1);
        p1 = list.pollFirst(); // Removes first element
        System.out.println("Poll First, removes first " + p1);
        p1 = list.pollLast();

        list.addAll( List.of("India","Canada","Australia", "UK", "USA", "India"));

        //Stack
        System.out.println("Before pop " + list);
        list.pop();
    }
}
