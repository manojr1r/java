package OOPS.Abstraction.StoreFront;

class Matteres extends ProductForSale{


    public Matteres(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails(){
        System.out.printf("This is a type: %s, details as follows, this has features of %s cost: %d%n", type, description, price);
    }
}
