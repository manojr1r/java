package ControlFlow;

public class Divisible3And5 {
    public static void main(String[] args) {
        int count =0;
        int sum = 0;
        for(int i=1; count <5 && i<=1000 ;i++){
           if( divisible3And5(i) ){
               count++;
               sum = sum+ i;
               System.out.println("Number divided by 3 and 5 is "+i);
           }
        }
        System.out.println("Total sum of those numbers is "+sum);
    }
    public static boolean divisible3And5(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }
}