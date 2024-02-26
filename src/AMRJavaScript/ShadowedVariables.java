package AMRJavaScript;

public class ShadowedVariables {
    static int a = 10;

    public static void main(String[] args) {
        int a = 5;
        a =3;
        System.out.println("'a' value from variable " + a);
        shadowedVariables();
    }
    public static void shadowedVariables(){
        System.out.println("'a' on method from field " + a);
    }
}
