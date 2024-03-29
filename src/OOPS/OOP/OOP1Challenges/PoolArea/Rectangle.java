package OOPS.OOP.OOP1Challenges.PoolArea;

public class Rectangle {
    private double width, length;

    public Rectangle(double width, double length) {
        if (width < 0){
            width = 0;
        }
        if (length < 0){
            length = 0;
        }
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return length * width;
    }
}