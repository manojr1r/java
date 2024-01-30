package AMRself;

public class Human {
    protected String name;
    private  int weight;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
    protected void eat(){
        System.out.println( name +" is eating");
    }
    public void walk(String speed){
        System.out.println(name + " is walking "+ speed);
    }
}
