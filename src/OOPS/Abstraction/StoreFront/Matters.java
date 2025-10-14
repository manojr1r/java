package OOPS.Abstraction.StoreFront;

class Matters extends ProductForSale{


    public Matters(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails(){
        System.out.printf("This is a type: %s, details as follows, on this you can sleep of-course and this has features of %s cost: %d%n", type, description, price);
    }
}
