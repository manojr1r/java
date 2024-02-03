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

    public void drive(){
        System.out.println( "Hybrid drive mix of both");
    }
    public void hdrive(){
        System.out.println( "Hybrid drive only");
    }

}
