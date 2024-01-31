package OOPS.OOP2.Composition.SmartKitchen;

public class CoffeeMaker {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if (hasWorkToDo) {
            System.out.println("Making Coffee");
            hasWorkToDo = false;
        }
    }
}
