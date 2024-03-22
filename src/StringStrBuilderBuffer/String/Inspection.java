package StringStrBuilderBuffer.String;

public class Inspection {
    public static void main(String[] args) {
        String greet = "Hello World";
        printInfo(greet);
    }

    public static void printInfo(String greet){
        if (greet.isBlank()); //isBlank() JDK 11
        if (greet.isEmpty()){return;} //return true for space

        System.out.println("greet.charAt(3) = " + greet.charAt(3));
        System.out.println("greet.indexOf('w') = "+ greet.indexOf('w')); //Case sensitive below overloaded method
        System.out.println("greet.indexOf('l, 3') = "+ greet.indexOf('l',3));//inclusive 3
        System.out.println(greet.toLowerCase().indexOf('w') );
    }
}
