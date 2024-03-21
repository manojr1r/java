package Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class CheckLamda {
    record Student(String name, Integer rno ){}
    public static void main(String[] args) {
        Student[] people = {new Student("Manoj" , 5) ,
                new Student("AMR", 1),
                new Student("AMR", 6),
                new Student("Reddy",25)};
        System.out.println(Arrays.toString(people));

//        Using Anonymous Class
        var anonymousClass = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return  ( ( o1.name.compareTo(o2.name)) + (o1.rno.compareTo(o2.rno)) );
            }
        };
        Arrays.sort(people , anonymousClass);
        System.out.println("anonymousClass\n" + Arrays.toString(people));

//        Using Lambda


        Arrays.sort(people, (o1, o2) -> (( o1.name.compareTo(o2.name)) + (o2.rno.compareTo(o1.rno))) ) ;
        Arrays.sort(people, (Student o1, Student o2) -> (( o1.name.compareTo(o2.name)) + (o2.rno.compareTo(o1.rno))) ) ;


        Arrays.sort(people, Comparator.comparing(o -> o.name));

        System.out.println(Arrays.toString(people));
    }
}
