package Collections.Set.HashSetpra;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class HashSetPra {
    public record Student(String name, int rno) {
    }
    public static void main(String[] args) {

        Student amr = new Student("amr", 1);
        Student apr = new Student("Apr",2);
        Student ysr = new Student("ysr",3);
        Student csk = new Student("Csk",5);
        Set<Student> unio = new java.util.HashSet<>(List.of(amr, apr, ysr));
        Set<Student> unio1 = new HashSet<>(List.of(apr, ysr, csk));

// Symmetric operation 
        unio.addAll(unio1); // as set will not add duplicates
        System.out.println("A ∪ B =" + unio);

        Set<Student> interset = new java.util.HashSet<>(List.of(amr, apr, ysr));
        interset.retainAll(unio1);
        System.out.println("A ∩ B =" + interset);
// ASymmetric



    }
}
