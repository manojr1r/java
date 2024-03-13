package OOPS.Abstraction.Challenge;

public abstract class ProductForSale {

    protected String type;
    private String item;
    private String description;

    @Override
    public String toString() {
        return  item ;
    }


    public ProductForSale(String type, String item, String description) {
        this.type = type;
        this.item = item;
        this.description = description;
    }
    public abstract void showDetails();

}
