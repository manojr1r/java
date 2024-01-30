package AMRself;

public class MainString {
    public static void main(String[] args) {

        String name = "Sony";
        String nameLower = name.toLowerCase();

        if (name.equals(nameLower)){
            System.out.println("Values match exactly");
        }
        if (name.equalsIgnoreCase(nameLower)){
            System.out.println("Values case sensitive ");
        }

        String name0 = "Sony";
        String name1 = new String("Sony");

        if (name0.equals(name1)){
            System.out.println("only equals"); // WILL NOT PRINT OUT ?
        }
        if (name0.contentEquals(name1) ){
            System.out.println("contentEquals");
        }
    }
}
