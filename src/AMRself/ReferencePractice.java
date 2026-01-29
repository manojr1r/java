package AMRself;

public class ReferencePractice {
    public static void main(String[] args) {
        int a = 5;
        int b = a;
        a = 7;

        System.out.println("b = " + b);

//Strings
        String name = "man";
        String last = name;

        System.out.println("last = " + last);
        name = "Red";

        System.out.println("last = " + last);

        // but obj ref change

        class Person {
            String name;
        }

        Person p1 = new Person();
        p1.name = "Man";

        Person p2 = p1;
        p1.name = "Red";

        System.out.println("p2.name = " + p2.name); // changes on p1 but p2 = Red

    }
}
