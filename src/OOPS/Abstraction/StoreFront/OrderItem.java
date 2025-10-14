package OOPS.Abstraction.StoreFront;

public class OrderItem {
    private int quantity;
    private final ProductForSale item;

    public OrderItem(ProductForSale item, int quantity) {
        this.quantity = quantity;
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public ProductForSale getItem() {
        return item;
    }

    public void setQuantity(int quantity) {
        this.quantity =quantity;
    }
}