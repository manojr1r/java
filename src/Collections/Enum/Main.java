package Collections.Enum;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        EnumIntro valu = EnumIntro.TEST_3;
        System.out.println("Single Value = "+ valu);

        var allValues = EnumIntro.values();
        System.out.println(Arrays.toString(allValues));
        //Creating object to use method on Enum

        enumSwitch(valu);

    }

    public static void enumSwitch(EnumIntro valu){
        System.out.println(valu.ordinal());
        switch (valu.ordinal()){
            case 0  -> System.out.println("ordinal 0");
            case 1  -> System.out.println("ordinal 1");
            case 2  -> System.out.println("ordinal 2");
            default -> System.out.println("ordinal 3");
        }

        switch (valu){
            case TEST_1 -> System.out.println("In Switch with the value in array!!");
            case TEST_2 -> System.out.println("In Switch with the value in array!");
        }
    }
}
