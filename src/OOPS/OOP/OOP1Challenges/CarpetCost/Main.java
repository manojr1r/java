package OOPS.OOP.OOP1Challenges.CarpetCost;

public class Main {
    public static void main(String[] args) {
        Floor floor = new Floor(63, 86);


        Carpet carpet = new Carpet(8);


        Calculator totalCost1 = new Calculator(floor , carpet);
//      Calculator totalCost2 = new Calculator(floorarea , carepetPerCoast);

        System.out.println(totalCost1.getTotalCost()); //43344

//        System.out.println(totalCost2.getTotalCost());
    }
}
