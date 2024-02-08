package OOPS.MasterChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Burger {
    protected String type, size;
    protected String toppings1, toppings2, toppings3;
    protected int price;

    public Burger(String type) {
        this(type , "Medium");
    }

    public Burger(String type, String size) {
        this.type = type;
        this.size = size;
    }
    private void Toppings() {
    }
    private void Toppings(String toppings1) {
        this.toppings1 = toppings1;
    }
    private void Toppings(String toppings1, String toppings2) {
        this.toppings1 = toppings1;
        this.toppings2 = toppings2;
    }
    protected void Toppings(String toppings1, String toppings2, String toppings3) {
        this.toppings1 = toppings1;
        this.toppings2 = toppings2;
        this.toppings3 = toppings3;
    }

    protected int getPrice(){
        price =  switch (size.toLowerCase().charAt(0)) {
            case 's' -> 15;
            case 'm' -> 20;
            default  ->  30;
        };
//        price +=  switch ()
        if (toppings1 != null && toppings2 != null && toppings3 != null){
            price += 30;
        } else if (toppings1 != null && toppings2 != null) {
            price += 20;
        }else if (toppings1 != null){
            price += 10;
        }
        return price;
    }


    public void selectBurger(){
        String toppings = selectTopings();
        System.out.println(toppings);
        price = getPrice();
        System.out.printf("%s%s, price %.2f\u0024 including tax\n", size,type ,price + (double) (price * 10) / 100);
    }

    protected String selectTopings(){
        String topping = null;
        StringBuilder toppings = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int i =0;
        do {
            System.out.println("Do you need any toppings?");
            topping = scanner.nextLine();
            i++;
            if ( topping.toLowerCase().contains("no") ) {
                break;
            }

            toppings.append(" , ").append(topping);
        }while (i<3);
        String[] selected = toppings.toString().split(",");
        System.out.println( Arrays.toString( selected ));
        for (String item : selected ){

        }

        return toppings.toString();
    }
}