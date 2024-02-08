package OOPS.OOP2.Polymorphism.Car1;

public class HybridCar extends Car {
    private double avgKmPerLiter;
    private int cyclinder, batterySize;

    public HybridCar(String description, double avgKmPerLiter, int cyclinder, int batterySize) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cyclinder = cyclinder;
        this.batterySize = batterySize;
    }

    public void runEngine(){
        System.out.printf( "Hybrid drive, mix of both %d cyclinders %d batterySize fired up\n",cyclinder, batterySize );
    }
    public void hybrid(){
        System.out.println( "Hybrid drive \"only\"");
    }

}
