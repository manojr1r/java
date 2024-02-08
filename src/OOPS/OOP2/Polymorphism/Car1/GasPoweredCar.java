package OOPS.OOP2.Polymorphism.Car1;

public class GasPoweredCar extends Car {
    private double avgKmPerLiter;
    private int cyclinder;

    public GasPoweredCar(String description, double avgKmPerLiter, int cyclinder) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cyclinder = cyclinder;
    }

    public void runEngine(){
        System.out.printf( "Gas powered Car engine started, %d cylinders fired up Feel the ride\n" , cyclinder);
    }
    public void fillFuel(){
        System.out.println( "'Petrol' / 'Diesel' filling");
    }
}
