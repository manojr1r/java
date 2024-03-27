package Collections.Set.LinkedHashSet;

import java.util.*;


public class TreesetPra {
    // Collection -> Set -> SortedSet => NavigableSet => implements TreeSet
    // SortedSet(interface) -> first, last, headfirst, tailSet and Comparator methods()
    // NavigableSet(interface) -> ceiling, floor, higher, lower, descendingSet.,
//Binary Search Tree  //red Black tree

    // LinkedHashSet Maintains insertion order
    // TreeSet is Sorted Collection
    record Student(String name, int rno) {
    }
    public static void main(String[] args) {
        Student amr = new Student("amr", 1);
        Student apr = new Student("Apr",2);
        Student ysr = new Student("ysr",3);
        Student csk = new Student("Csk",5);
        Comparator<Student> sor = Comparator.comparing(Student::name);
        NavigableSet<Student> unio = new TreeSet<>( sor);

        //tailSet
        //headSet //inclusive only if overloaded

    }
}
