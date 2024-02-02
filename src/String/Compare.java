package String;

public class Compare {
    public static void main(String[] args) {
        String name = "wer";

        if (name.contains("qQ")){
            System.out.println("type.contains");

        }
        if  ("Qwerty".contains(name)){
            System.out.println("\"Qq\".contains"); // will execute IF has "q" or "Q" only
            // means, if "Qp will not execute"
        }
    }
}
