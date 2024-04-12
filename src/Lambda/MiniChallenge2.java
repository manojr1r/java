package Lambda;

import Lambda.Categories.Supplier;

public class MiniChallenge2 {
    public static void main(String[] args) {
        System.out.println(everySecoundChar("Hello world"));
    }

    public static String everySecoundChar(String source){
        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if ( i % 2  == 1) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();

    }


}
