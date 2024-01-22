package OOP.Constructor.Basics;

public class Main {
    public static void main(String[] args) {
        Basics obj1 = new Basics();
        Basics obj2 = new Basics(/*5*/); /*Even though there is a constructor which accepts parameter
        but the modifier is private, hence throws compile time error*/

    }
}
