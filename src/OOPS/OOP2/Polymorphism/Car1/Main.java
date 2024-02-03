package OOPS.OOP2.Polymorphism.Car1;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car("Hybrid");
//        testRide(car);
        Car hCarcar = new HybridCar("Fuel cell",25,4,2000);
//        testRide(hCarcar);
        //hCarcar.hdrive(); /*As Car is the type method cannot access the method of HybridCar*/

        HybridCar hCar = new HybridCar("Fuel cell",25,4,2000);
        testRide(hCar);
//        hCar.hdrive();


    }

    private static void testRide(Car car){
        car.startEngine();
        car.runEngine();
        car.onlyCar();
    }
}
