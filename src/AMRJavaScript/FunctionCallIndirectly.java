package AMRJavaScript;

public class FunctionCallIndirectly {

//    Can we pass a method name as parameter?
    public static void main(String[] args) {
//        callingFunction(doubleValue() , 5);

        // lambda expression to define the calculate method
        TripleValue f = a -> a * 3;

        // parameter passed and return type must be same as defined
        System.out.println(f.calculate(5));
    }

    @FunctionalInterface
    interface TripleValue {
        int calculate(int x);
    }

//    public static void execute(TripleValue f) {
//        f.calculate();
//    }

    public static int doubleValue(int a){
        return a * 2;
    }
    public static void  callingFunction(int value , FunctionCallIndirectly methodName){
//        methodName(value);
    }
}
