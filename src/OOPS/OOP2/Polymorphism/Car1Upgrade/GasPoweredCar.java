package OOPS.OOP2.Polymorphism.Car1Upgrade;

public class GasPoweredCar extends Car {
    private double avgKmPerLiter;
    private int cyclinder;

    public GasPoweredCar(double avgKmPerLiter, int cyclinder) {
        System.out.println("Gas car selected");
        this.avgKmPerLiter = avgKmPerLiter;
        this.cyclinder = cyclinder;
    }
    public void drive(){
        System.out.println( "Feel the combustion engine ride");
    }
    public void fillFuel(){
        System.out.println( "'Petrol' / 'Diesel' filling");
    }
}
