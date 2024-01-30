package String;

public class StringBuilderPractise {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello World");

        System.out.println( builder.length());
        System.out.println(builder.deleteCharAt(3));
    }
}
