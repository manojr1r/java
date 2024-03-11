package Collections.List.LinkedList;

import java.util.LinkedList;

public class Retrieve {
    protected static void gettingElmenets(LinkedList<String> list){
        System.out.println("Retrieved list " + list.get(0));
        System.out.println("First "+ list.getFirst());
        System.out.println("last "+ list.getLast());

        System.out.println("USA is in position of " + list.indexOf("USA"));
        System.out.println("Last index " + list.lastIndexOf("USA"));

        //Queue
        System.out.printf("%nQueue Methods%n 'Element' follow FiFo %s%n", list.element());

        //Stack
        System.out.printf("%nStack Methods%n 'peek()' %s %n" , list.peek());
        System.out.println(" 'peekFirst()' " + list.peekFirst());
        System.out.println(" 'peekLast()'  " + list.peekLast());
    }
}
