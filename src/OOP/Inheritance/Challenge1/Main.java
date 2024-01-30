package OOP.Inheritance.Challenge1;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee salaryguy = new SalariedEmployee("Meghana","1981-07-17","2024-04-05",300000);

        salaryguy.retire();
        System.out.println( salaryguy.toString());
//        Worker worker = new Worker("Meghana","2001-07-17");
//        System.out.println( worker.getAge());

    }

}
