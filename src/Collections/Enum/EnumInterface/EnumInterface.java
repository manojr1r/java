package Collections.Enum.EnumInterface;

import java.util.Arrays;

enum EnumInterface implements Interface {TEST_1,
    TEST_2,
    TEST_3; //";" needed as extra methods has written


    @Override
    public void abstractMethod() {

        System.out.println("Abstract method on Interface");
        System.out.println(Arrays.toString(values()));
        if (this == TEST_1){
            System.out.println("Selected TEST_1");
        }
        switch (this){
            case TEST_2 -> System.out.println("TEST_2");
            case TEST_3 -> System.out.println("3");
        }
    }
}
