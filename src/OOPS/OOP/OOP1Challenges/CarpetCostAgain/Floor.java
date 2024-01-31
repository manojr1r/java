package OOPS.OOP.OOP1Challenges.CarpetCostAgain;

public class Floor {
    private double length, width;

    public Floor(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea(){
        return length * width;
    }
}
