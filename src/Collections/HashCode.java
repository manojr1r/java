package Collections;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class HashCode {
    public static void main(String... args) {

        String atext = "Hello";
        String bText = "He" + "llo";
        String cText = String.join("l","He","lo");
        String dText = "He".concat("llo");
        String eText = "hello";

        List <String> hellos = List.of(atext, bText, cText, dText, eText);
        hellos.forEach(s -> System.out.println(s+" "+s.hashCode()));
        Set<String> mySet = new HashSet<>(hellos);
        System.out.println("Set "+mySet);


        for (String value : mySet){
            for (int i = 0; i < hellos.size(); i++) {
                if (Objects.equals(hellos.get(i), value)){
                    System.out.println("equals "+i );
                }
                if (hellos.get(i) == value){
                    System.out.println( "== "+i + ", ");
//                    .join and .concat these both methods return new instances of the string, So 2, 3 are not in Hello output for ==
                }
            }

        }

    }

    public static String reverse(String correct){
        return String.valueOf(new StringBuilder(correct).reverse());
    }
}
