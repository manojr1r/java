package OOPS.MasterChallenge;

public class Drink {
    private String type, size;
    private int price;

    public Drink(String type) {
        this(type, "small");
    }
    public Drink(String type, String size) {
        this.type = type;
        this.size = size;
    }

    protected int getPrice(){
        return switch (size.toLowerCase().charAt(0)) {
            case 's' -> price = 5;
            case 'm' -> price = 8;
            default -> price = 10;
        };
    }


    public void selectDrink(){
        price = getPrice();
        System.out.printf("%s%s, price %.2f$ including tax\n", size , type , (price + (double) (price * 10) / 100 ));
    }
}
