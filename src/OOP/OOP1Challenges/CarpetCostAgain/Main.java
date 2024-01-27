package OOP.OOP1Challenges.CarpetCostAgain;

public class Main {
    public static void main(String[] args) {
        Floor floor = new Floor(10,10);/*
        this will create Floor class object in which length and width are saved and the object is labelled as "floor"

        */
        Carpet carpet = new Carpet(30);

        Calculator calculator = new Calculator(floor /* an object passed to cal */ , carpet );
        System.out.println( calculator.getCost());
    }
}
