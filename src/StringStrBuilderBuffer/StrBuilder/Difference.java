package StringStrBuilderBuffer.StrBuilder;

public class Difference {
    public static void main(String[] args) {
        String helloWorld= " Hello World";
        StringBuilder helloBuilder = new StringBuilder(helloWorld);
        compare(helloWorld, helloBuilder);
        helloWorld.concat(" and Good Bye"); // String Method
        helloBuilder.append(" and Good Bye");   //StrBuilder Method
        compare(helloWorld, helloBuilder);  //Check Output

    }

    public static void compare(String string, StringBuilder strBuilder){
        System.out.println("string = " + string);
        System.out.println("length = " + string.length());

        System.out.println("strBuilder = " + strBuilder);
        System.out.println("length = " + strBuilder.length());

    }
}
