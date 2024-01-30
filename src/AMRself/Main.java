package AMRself;

public class Main {
    public static void main(String[] args) {
        Human sony = new Human("Meghana");
       Human pramod = new Human("Richard");
       humanThings(pramod, "Medium Fast");
        humanThings(sony, "Medium");
    }
    private static void humanThings(Human human , String pace){
        human.eat();
        human.walk(pace);
    }

}
