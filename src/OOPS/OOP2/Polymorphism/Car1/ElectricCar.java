package OOPS.OOP2.Polymorphism.Car1;

public class ElectricCar extends Car {
    private double avgKmPerLiter;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerLiter, int batterySize) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
    }

    public void runEngine(){
        System.out.printf( "Electrifying the world in silence, %d battery size\n", batterySize);
    }
    public void charge(){
        System.out.println( "Battery Charging");
    }
}
