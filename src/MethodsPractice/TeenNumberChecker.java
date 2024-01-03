package MethodsPractice;

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println( hasTeen(1,1,45));
    }
    public static boolean hasTeen(int first, int second, int third){
        return (isTeen(first) || isTeen(second) || isTeen(third));
    }
    public static boolean isTeen(int age){
        return  (age>=13 && age <=19);
    }
}
