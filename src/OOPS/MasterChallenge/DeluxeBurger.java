package OOPS.MasterChallenge;

import java.util.Scanner;

public class DeluxeBurger extends Burger {

    private String toppings4, toppings5;

    public DeluxeBurger(String type) {
        super(type, "Large");
         price = 62;
    }

    protected String selectTopings(){
        String topping = null;
        StringBuilder toppings = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int i =0;
        do {
            System.out.println("Deluxe burger can have 5 toppings for free");
            topping = scanner.nextLine();
            i++;
            if ( topping.toLowerCase().contains("no") ) {
                break;
            }

            toppings.append(" , ").append(topping);
        }while (i<5);
        return topping;
    }
}
