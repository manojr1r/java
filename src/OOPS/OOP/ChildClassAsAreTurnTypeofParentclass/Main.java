package OOPS.OOP.ChildClassAsAreTurnTypeofParentclass;

public class Main {
    public static void main(String[] args) {
        Parent par1 = new Parent("Par-1",1);
//      Parent par2 = par1.createNewObject("Par-2", 2);

//        System.out.println("par1 = "+par1);
//      System.out.println("par2 = " + par2);

        Child chi1 = new Child("Chi-1",1, 20);
        System.out.println(chi1);

    }
}
