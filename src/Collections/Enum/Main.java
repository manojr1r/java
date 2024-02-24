package Collections.Enum;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Intro valu = Intro.TEST_1;
        System.out.println("Single Value = "+ valu);

        var allValues = Intro.values();
        System.out.println(Arrays.toString(allValues));

        enumSwitch(valu);
    }

    public static void enumSwitch(Intro valu){
        System.out.println(valu.ordinal());
        switch (valu.ordinal()){
            case 0  -> System.out.println("Or0");
            case 1  -> System.out.println("or1");
            case 2  -> System.out.println("or");
            default -> System.out.println("def");
        }

        switch (valu){
            case TEST_1 -> System.out.println("With the value in array!!");
            case Test_2 -> System.out.println("With the value in array!");
        }
    }
}
