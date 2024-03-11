package Collections.List.LinkedList;

import java.util.LinkedList;

import static Collections.List.LinkedList.Remove.removeTypes;
import static Collections.List.LinkedList.Retrieve.gettingElmenets;


public class Add {
    public static void main(String[] args) {
//        LinkedList<String> linkedList = new LinkedList<>();
        var placesToVist = new LinkedList<String>();

        placesToVist.add("Canberra");
        placesToVist.add(0,"Canada");
        System.out.println(placesToVist);

        addingTypes(placesToVist);
        System.out.println(placesToVist);

//        removeTypes(placesToVist);
//        System.out.println(placesToVist);
        gettingElmenets(placesToVist);

    }

    public static void addingTypes(LinkedList<String> list){
        list.addFirst("Paris");
        list.addLast("USA");

        //Queue methods
        list.offer("USA");
        list.offerFirst("Dubai");
        list.offerLast("UK");

        //Stack methods
        list.push("India");

    }

}
