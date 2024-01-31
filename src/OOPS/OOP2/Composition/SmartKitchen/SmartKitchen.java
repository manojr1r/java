package OOPS.OOP2.Composition.SmartKitchen;

public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigertor iceBox;

    public SmartKitchen() {
        iceBox = new Refrigertor();
        dishWasher = new DishWasher();
        brewMaster = new CoffeeMaker();
    }

    private void addWater(){

        System.out.println("Adding water \" Smart Kitchen \"");


    }
    private void pourMilk(){

        System.out.println("adding milk \" Smart Kitchen \"");
    }

    private void loadDishwasher(){
        System.out.println("Dish washer starting up \" Smart Kitchen \"");

    }

    public void setKitchenState(boolean cofeeFlag , boolean refrigeratorFlag , boolean dishwasherFlag){
        brewMaster.setHasWorkToDo (cofeeFlag);
        iceBox.setHasWorkToDo(refrigeratorFlag);
        dishWasher.setHasWorkToDo(dishwasherFlag);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}
