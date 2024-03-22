package StringStrBuilderBuffer.StrBuilder;

public class Main {
    public static void main(String[] args) {
        String helloWorld= " Hello World";
        StringBuilder helloBuilder = new StringBuilder("Hello "+ "Builder ");
        instantiating();
    }
    public  static void instantiating(){
        StringBuilder helloBuilder = new StringBuilder("Hello "+ "Builder ");
        StringBuilder emptyBuilder = new StringBuilder();
        StringBuilder empty5 = new StringBuilder(5);
        StringBuilder fromExisting = new StringBuilder(helloBuilder);
    }

}
