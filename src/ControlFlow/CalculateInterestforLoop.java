package ControlFlow;

public class CalculateInterestforLoop {
    public static void main(String[] args) {
        for(double rate=7.5;rate<=10;rate+=0.25) {
            System.out.println("100 at " +rate+"% interest = \u20B9" + calculateIntrest(100,rate));
        }
    }
    public static double calculateIntrest(double amount,double intrestRate){
        return (amount * (intrestRate/100));

    }

}
