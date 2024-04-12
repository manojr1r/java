package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MiniChallenge {
    public static void main(String[] args) {
        Consumer<String> printTheParts = (sentence ) -> {
            String[] parts = sentence.split(" ");
            for (String part : parts){
                System.out.print(part +",. ");
            }
        };
        System.out.println();

        Consumer<String> printForEach = (sentence ) -> {
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(s -> System.out.print(s + "., "));

        };
        System.out.println();

        Consumer<String> printConsise = (sentence ) ->
            Arrays.asList(sentence.split(" ")).forEach(words -> System.out.print(words + ",, "));

        System.out.println();





        printTheParts.accept("Let's split this up into an array");
        printForEach.accept("Let's split this up into an array");
        printConsise.accept("Let's split this up into an array");
    }
}
