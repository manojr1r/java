package OOPS.OOP2.Polymorphism.Car1Upgrade;

public class Car {
/*
    public static Car carSelection(String description, double avgKmPerLiter,int cyclinder){
        return carSelection(description, avgKmPerLiter, cyclinder,0);
    }

    public static Car carSelection(String description ,double avgKmPerLiter,int cyclinder, int batterySize){
        return switch (description){
            case "Gas", "gas" ->  new GasPoweredCar(avgKmPerLiter,cyclinder );
            case "Electric", "electric" ->  new ElectricCar(avgKmPerLiter,batterySize );
            case "Hybrid", "hybrid" -> new HybridCar(avgKmPerLiter,cyclinder ,batterySize);
            default ->    new Car();
        };
    }
*/
    public void startEngine(){
        System.out.println("Car -> Engine starts");
    }
    public void drive(){
        System.out.println( "No Type car selected");
    }
    protected void runEngine(){

        System.out.println("Engine start running");
        System.out.println( getClass().getSimpleName() + " driving");
        drive();
    }

}
