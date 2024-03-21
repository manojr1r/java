package Collections.Set;

public class HashCode {
    public static void main(String... args) {

        String correct = "This is a correct String";
        System.out.println( reverse(correct));
    }

    public static String reverse(String correct){
        return String.valueOf(new StringBuilder(correct).reverse());
    }
}
