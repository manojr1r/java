package Lambda;

import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        System.out.println( operate((a,b) -> a+b, "5" , "6"));
    }

    public static <T> T operate(BinaryOperator<T> function,  T value1 , T value2 ){
        return function.apply(value1 , value2);
    }
}
