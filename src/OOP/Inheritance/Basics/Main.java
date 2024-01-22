package OOP.Inheritance.Basics;

public class Main {
    public static void main(String[] args) {
        Animal ani = new Animal("Generic","small", 20);
        doAnimalStuff(ani, 30);
    }

    public static void doAnimalStuff (Animal animalObject /* if we not create Animal class this is a Error */, int speed){
        animalObject.makeNoise();
        animalObject.move(speed);
        animalObject.move(45);
        System.out.print(animalObject);
    }
}
