package Generics.Generics;

public class Mani2 {
    public static void main(String[] args) {
        Team<BaseballPlayer , String> twoGenerics = new Team<>("US" );
        // We cannot send partial in Generics
        Team twoGenerics1 = new Team("US" , "Country" ); //this is Entirely Empty one
        twoGenerics.twoGenerics();
        twoGenerics1.twoGenerics();

    }
}
