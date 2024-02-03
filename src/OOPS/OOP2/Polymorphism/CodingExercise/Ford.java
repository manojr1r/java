package OOPS.OOP2.Polymorphism.CodingExercise;

public class Ford extends  Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public int getCylinders() {
        return super.getCylinders();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }
}
