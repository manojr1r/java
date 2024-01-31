package OOPS.OOP.OOP1Challenges.CarpetCostAgain;

public class Calculator {
    public Calculator(Floor floor, Carpet carpetCostperInch) {
        this.floor = floor;
        this.carpetCostperInch = carpetCostperInch;
    }

    private Floor floor;
    private Carpet carpetCostperInch;

    public double getCost(/*Floor floor, Carpet carpetCostperInch*/){
        return floor.getArea() *  carpetCostperInch.getCost();
    }



}
