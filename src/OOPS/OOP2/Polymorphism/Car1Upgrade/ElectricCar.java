package OOPS.OOP2.Polymorphism.Car1Upgrade;

public class ElectricCar extends Car {
    private double avgKmPerLiter;
    private int batterySize;

    public ElectricCar(double avgKmPerLiter, int batterySize) {
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
    }

    public void charge() {
        System.out.println("Battery Charging");
    }

    public void drive(){
        System.out.println( "Electrifying the world in silence");
    }
}
