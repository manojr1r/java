package OOPS.OOP2.Polymorphism.Car1Upgrade;

public class Car {

    public static Car carSelection(String description, double avgKmPerLiter,int cyclinder){
        return carSelection(description, avgKmPerLiter, cyclinder,0);
    }
    public static Car carSelection(String description ,double avgKmPerLiter,int cyclinder, int batterySize){
        switch (description){
            case "Gas", "gas" -> {
              return   new GasPoweredCar(avgKmPerLiter,cyclinder );}
            case "Electric", "electric" -> {return new ElectricCar(avgKmPerLiter,batterySize );
                }
            case "Hybrid", "hybrid" -> {return new HybridCar(avgKmPerLiter,cyclinder ,batterySize);
               }
            default -> {
                return new Car();
            }
        }
    }

    public void startEngine(){
        System.out.println("Car -> Engine starts");
    }
    public void drive(){
        System.out.println( "No car selected");
    }
    protected void runEngine(){
        System.out.println("Engine start running");
        System.out.println( getClass().getSimpleName() + " driving");
        drive();
    }

}
