package OOPS.OOP2.Polymorphism.Car1;

public class Car {
    private String description;

    public Car(String description){
       this.description = description;
    }

    public void startEngine(){
        System.out.println(getClass().getSimpleName() + " -> Engine starts");
    }

    public void drive(){
        System.out.println("Fasten the seat belts, drive started");
        System.out.println( getClass().getSimpleName() + " driving");
        runEngine();
    }

    protected void runEngine(){
        System.out.println("Engine start running");
    }
    public void car(){
        System.out.println(getClass().getSimpleName() + " only \"CAR\" class method");
    }
}
