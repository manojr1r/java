package OOPS.MasterChallenge;

public class SideItem {
    private String type, size;
    private int price;

    public SideItem(String type) {
        this(type, "Medium");
    }
    public SideItem(String type, String size) {
        this.type = type;
        this.size = size;
    }

    protected int getPrice(){
        return switch (size.toLowerCase().charAt(0)) {
            case 's' -> price = 8;
            case 'm' -> price = 12;
            default -> price = 14;
        };
    }
    public void selectSideItem(){
        price = getPrice();
        System.out.printf("%s%s, price %.2f\u0024 including tax\n", size,type , price + (double) (price * 10) / 100 );
    }
}
