package StringStrBuilderBuffer.String;

public class Comparison {
    public static void main(String[] args) {
        String greet = "Hello World";
        System.out.println("contentEquals: can compare Str & SBuilder "+ greet.contentEquals("He"));
        if( greet.equals("Hello World")){System.out.println("equals");}
        System.out.println("equalsIgnoreCase " +greet.equalsIgnoreCase("hELlO WorlD"));
    //SubString compare
        System.out.println("contains " + greet.contains("He"));
        System.out.print("startsWith() " + greet.startsWith("W")+"  ");
        System.out.println("endsWith() " + greet.endsWith("W"));
        System.out.println("regionMatches() " + greet.regionMatches(6,"wor",0, "wor".length())); //overLoad caseSensitive
        System.out.println("regionMatches() caseSensitive = " + greet.regionMatches(true,6,"wor",0, "wor".length()));

        System.out.println( greet.compareTo("")); //comparable Class used for sorting
//        greet.matches("");  // regex
    }
}
