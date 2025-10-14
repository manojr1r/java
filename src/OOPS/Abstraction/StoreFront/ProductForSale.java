package OOPS.Abstraction.StoreFront;

public abstract class ProductForSale {

    protected final String type;
    protected final int price;
    protected final String description;

    @Override
    public String toString() {
        return  type ;
    }


    public ProductForSale(String type, int price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }
    public abstract void showDetails();

    protected static int salesPrice(ProductForSale item, int quantity){
        return item.price * quantity;
        
    }

    public int getPrice() {
        return price;
    }

}
