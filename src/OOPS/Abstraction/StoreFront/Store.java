package OOPS.Abstraction.StoreFront;

import java.util.ArrayList;
import java.util.List;

import static OOPS.Abstraction.StoreFront.ProductForSale.salesPrice;

class Store {
    static List<ProductForSale> productForSales = new ArrayList<>();
    static List<OrderItem> orderItems = new ArrayList<>(10);
    public static void main(String[] args) {


       ProductForSale sneakers = new Shoes("rest Walk", 7000, "to walk");
        ProductForSale regularShoes = new Shoes("shoes", 900, "for school");
        ProductForSale ecoLatexClassic = new Matters("beds", 14999, "for sleep");
        productForSales.add(sneakers);
        productForSales.add(regularShoes);
        productForSales.add(ecoLatexClassic);
        addItem(regularShoes, 4);
        addItem(regularShoes, 2);
        addItem(ecoLatexClassic, 2);
        addItem(ecoLatexClassic, 2);

        printOrder();
    }


    public static void addItem(ProductForSale item, int quantity){
        boolean itemFound =false;
        for (OrderItem orderItem : orderItems){
            if (orderItem.getItem().equals(item)){
                orderItem.setQuantity(orderItem.getQuantity() + quantity);
                itemFound = true;
                break;
            }
        }
       if (!itemFound) {
           OrderItem orderItem = new OrderItem(item, quantity);
           item.showDetails();
           orderItems.add(orderItem);
       }
    }

    public static void printOrder(){
        double orderTotal = 0;
        for (OrderItem orderedItem:orderItems){
            int itemTotal = salesPrice(orderedItem.getItem(), orderedItem.getQuantity());
            orderTotal += itemTotal;
            System.out.println(orderedItem.getItem() + " each "+ orderedItem.getItem().getPrice() + ", Quantity " + orderedItem.getQuantity() + ", Total = " + itemTotal);
        }
        System.out.println("\n "+("-".repeat(30) +"\n "+"Total order amount = " + orderTotal ));
    }

}
