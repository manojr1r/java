package Collections.Enum;

import java.util.Arrays;

public class MainSwitch {
    protected enum EnumIntro  {TEST_1,
        TEST_2,
        TEST_3
    }
    public static void main(String[] args) {
        EnumIntro valu = EnumIntro.TEST_3;
        System.out.println("Single Value "+ Main.EnumIntro.TEST_3.ordinal()+" = "+ valu);

        //Creating object to use method on Enum
        enumSwitch(valu);

    }

    public static void enumSwitch(EnumIntro valu){
        System.out.println("valu.ordinal() "+valu.ordinal());
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
