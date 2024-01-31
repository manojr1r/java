package OOPS.OOP.Inheritance.Basics;

public class Animal {
    private String type;
    private String size;  /* small medium large */
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public void makeNoise(){
        System.out.println("Animal makeNoise method");
    }
    public void move( int speed){
        System.out.println("Animal type "+type+" is moving at speed of "+ speed);
    }

    public String toString(){
        return type + " " + size + " " +weight ;
    }
}
