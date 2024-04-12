package Collections.Enum;

import java.util.Arrays;

public class Main {
    protected enum EnumIntro  {TEST_1,
        TEST_2,
        TEST_3
    }
    public static void main(String[] args) {
        //index of the that value
        System.out.println(EnumIntro.TEST_1.ordinal() +" index value is grabbed by 'ordinal()'"+ EnumIntro.TEST_1);

//        System.out.println(EnumIntro.values());//Need to wrap Array
        System.out.println(Arrays.toString(EnumIntro.values())); // Will print all the values in enum
        System.out.println(EnumIntro.values()[1]); // single value index
//        System.out.println(EnumIntro.);
        int val = EnumIntro.TEST_3.ordinal();//index of the that value
        System.out.println(val);
        System.out.println("-----------------------".repeat(1));
        for (EnumIntro value: EnumIntro.values()){
            System.out.println(value.ordinal()+" = "+ value);
        }
    }
}
