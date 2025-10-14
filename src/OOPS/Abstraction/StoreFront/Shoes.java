package OOPS.Abstraction.StoreFront;

class Shoes extends ProductForSale {

    public Shoes(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails(){
        System.out.printf("This is a type: %s, details as follows, this has features of %s price: %d%n", type, description, price);
    }
}
