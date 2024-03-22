package StringStrBuilderBuffer;

public class TextBlock {
    public static void main(String[] args) {
//        From JDK 15

        String points = """
                This is first line where can start
                \u2022 used    Tab here
                
                """ ;
        System.out.println(points);
    }
}
