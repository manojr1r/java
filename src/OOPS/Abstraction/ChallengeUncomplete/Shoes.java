package OOPS.Abstraction.ChallengeUncomplete;

public class Shoes extends ProductForSale{

    public Shoes(String type, String item, String description) {
        super(type, item, description);
    }

    @Override
    public void showDetails() {
        System.out.printf("this is a %s shoe%n",super.type);
    }
}
