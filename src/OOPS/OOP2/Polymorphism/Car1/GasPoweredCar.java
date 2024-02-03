package OOPS.OOP2.Polymorphism.Car1;

public class GasPoweredCar extends Car {
    private double avgKmPerLiter;
    private int cyclinder;

    public GasPoweredCar(String description, double avgKmPerLiter, int cyclinder) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cyclinder = cyclinder;
    }

    public GasPoweredCar(double avgKmPerLiter, int cyclinder) {
        super("Gas");
        System.out.println("Gas car selected");
        this.avgKmPerLiter = avgKmPerLiter;
        this.cyclinder = cyclinder;
    }
    public void drive(){
        System.out.println( "Feel the ride");
    }
}
