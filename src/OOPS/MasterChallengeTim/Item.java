package OOPS.MasterChallengeTim;

public class Item {
    private String name , type;
    private double price;
    private String size;

    public Item(String type, String name,  double price) {
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.price = price;
    }


    public double getBasePrice() {
        return price;
    }
    public double getAdjustedPrice() {
        return price;
    }
    public void printItem(){
        System.out.println();
    }
}
