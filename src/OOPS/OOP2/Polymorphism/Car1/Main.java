package OOPS.OOP2.Polymorphism.Car1;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car("Hybrid");
//        testRide(car);
        Car hCarcar = new HybridCar("Fuel cell",25,4,2000);

        testRide(hCarcar);
        //hCarcar.hybrid(); /*As Car is the type method cannot access the method in which of HybridCar*/

        HybridCar hCar = new HybridCar("Fuel cell",25,4,2000);
        hCar.hybrid();
        testRide(hCar);
//        hCar.hdrive();


    }

    private static void testRide(Car car){
        car.startEngine();
        car.drive();
        car.car();
        System.out.println("*************");
    }
}
