package AMRJavaScript;

public class FunctionCallIndirectly {

//    Can we pass a method name as parameter?
    public static void main(String[] args) {
//        callingFunction(doubleValue() , 5);
    }

    public static int doubleValue(int a){
        return a * 2;
    }
    public static void  callingFunction(int value , FunctionCallIndirectly methodName){
//        methodName(value);
    }
}
