package OOPS.OOP2.Composition.SmartKitchen;

public class DishWasher {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if(hasWorkToDo) {
            System.out.println("Cleaning dishes");
            hasWorkToDo = false;
        }
    }
}
