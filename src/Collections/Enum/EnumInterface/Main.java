package Collections.Enum.EnumInterface;

public class Main {
    public static void main(String[] args) {

        EnumInterMainClass int1 = new EnumInterMainClass();
        int1.abstractMethod();
        //Down no new keyword as it's a Enum
        EnumInterface test = EnumInterface.TEST_2;
        //and calling method
        test.abstractMethod();

    }
}
