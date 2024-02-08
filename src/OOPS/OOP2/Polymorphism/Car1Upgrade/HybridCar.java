package OOPS.OOP2.Polymorphism.Car1Upgrade;
public class HybridCar extends Car {
    private double avgKmPerLiter;
    private int cyclinder, batterySize;

    public HybridCar(double avgKmPerLiter, int cyclinder, int batterySize) {

        this.avgKmPerLiter = avgKmPerLiter;
        this.cyclinder = cyclinder;
        this.batterySize = batterySize;
    }

    public void drive(){
        System.out.println( "Hybrid drive, \"mix of both\"");
    }
    public void hybrid(){
        System.out.println( "Check fuel \"Gas\" & \"Charge\"");
    }

}
