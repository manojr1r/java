package OOPS.Abstraction.ChallengeUncomplete;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public static void main(String[] args) {
        Store store = new Store();
//        ProductForSale sleep = new ProductForSale("rest", "bed Sheet", "to sleep");
//        store.addOrder(new ProductForSale("eat", "egg", "one yellow"));
//        store.addOrder(sleep);
        store.printOrder();
    }
    List<ProductForSale> sale = new ArrayList<>(10);
    List<ProductForSale> orderItems = new ArrayList<>(10);

    public void addOrder(ProductForSale item){
        orderItems.add(item);
    }

    public void printOrder(){
        System.out.println(orderItems);
    }

}
