package OOPS.OOP.OOP1Challenges.Cylinder;

public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius < 0){
            radius = 0;
        }
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    public double getArea(){
        System.out.println(" The round of "+ ( Math.PI * radius * radius)+ " is " + Math.round( Math.PI * radius * radius) +
                " ,Up to two decimals "+ Math.round(( Math.PI * radius * radius*100))/100.0  );

        return ( Math.PI * radius * radius);

    }
}
