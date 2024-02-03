package OOPS.OOP2.Polymorphism.Car1;

public class ElectricCar extends Car {
    private double avgKmPerLiter;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerLiter, int batterySize) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
    }

    public void drive(){
        runEngine();
        System.out.println( "Electrifying the world in silence");
    }
}
