package OOPS.OOP2.Composition.CodingExercise;

public class Bedroom {
    private String name;
    private Wall wall1, wall2, wall3, wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    //getLamp() which returns an object of type Lamp,
    // and makeBed() which prints a message that the bed is being made
    // and also calls the make() method in the Bed class.

    public Lamp getLamp(){
        return lamp;
    }

    public void makeBed(){
        System.out.println("that the bed is being made");
        bed.make();
    }

}
