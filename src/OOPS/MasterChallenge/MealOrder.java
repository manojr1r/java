package OOPS.MasterChallenge;

import OOPS.OOP2.Encapsulation.Printer;

public class MealOrder {
    private Burger burger;
    private Drink drink;
    private SideItem extra;

    public MealOrder() {
        this(new Burger("Chicken"), new Drink("Coke"),  new SideItem("fries"));
    }

    public MealOrder(Burger burger, Drink drink, SideItem extra) {
        this.burger = burger;
        this.drink = drink;
        this.extra = extra;
    }

    public void selectOrder(){
        burger.selectBurger();
        drink.selectDrink();
        extra.selectSideItem();
        int price = burger.getPrice()+ drink.getPrice() + extra.getPrice();
        double totalprice = price + (double) (price * 10) / 100;
        System.out.printf("The total bill of your order %.2f\n\n",totalprice);
    }
}
