package Comparable;

public class Intro {
    public static void main(String[] args) {
        Integer[] intlist = {-2,5,10,};
        Integer intVal = 5;
        for (int value : intlist){
            int diff = intVal.compareTo(value);
            System.out.printf("%s %s %s : diff is %s %n",intVal , diff>0? ">": diff==0 ? "==" : "<" , value, diff);
        }
        System.out.println();
        String[] stringlist = {"Banana" , "apple" ,"banana",""," ", "pears"};
        String val = "banana";
        for (String value : stringlist){
            int diff = val.compareTo(value);
            System.out.printf("%s %s %-7s :  diff is %s %n",val , diff>0? ">": diff==0 ? "==" : "<" , value, diff);
        }
    }
}
