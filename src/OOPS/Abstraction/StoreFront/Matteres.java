package OOPS.Abstraction.StoreFront;

class Shoes extends ProductForSale{
    private final String type;
    private final int price;
    private final String description;

    public Shoes(String type, int price, String description) {
        super(type, price, description);
        this.type = type;
        this.price = price;
        this.description = description;
    }

    @Override
    public void showDetails(){
        System.out.printf("This is a type: %s, details as follows, this has features of %s price: %d%n", this.type, this.description, this.price);
    }
}
