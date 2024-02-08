package OOPS.MasterChallenge;

public class Toppings {

    private String toppings1, toppings2, toppings3;

    public Toppings() {
        this(null, null, null);
    }
    public Toppings(String toppings1) {
        this(toppings1, null, null);
    }

    public Toppings(String toppings1, String toppings2) {
        this(toppings1, toppings2, null);
    }

    public Toppings(String toppings1, String toppings2, String toppings3) {
        this.toppings1 = toppings1;
        this.toppings2 = toppings2;
        this.toppings3 = toppings3;
    }
}
