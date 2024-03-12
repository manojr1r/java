package Collections.AutoBox_UnBoxing;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(500);

    public Bank(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private  Customer getCustomer(String name) {
        for (Customer cust : customers){
            if (cust.name().equalsIgnoreCase(name)){
                return cust;
            }
        }
        System.out.println(name + " not found");
       return null;
    }


    public void addNewCustomers(Customer customer , double depositAmount) {
        if (getCustomer(customer.name()) == null){
            customers.add(customer);
            customer.transactions().add(depositAmount);
            System.out.println(customer.name() +" add into "+ name);
        }
    }

    public void transaction(Customer customer , double amt){
        if(getCustomer(customer.name()) != null) {
            customer.transactions().add(amt);
        }
    }
    public void transactionList(Customer customer ){
        if (customers.contains(customer)) {
            System.out.println(customer.name());
            for (var transaction :customer.transactions()){
                System.out.printf("%10.2f %n",transaction);
            }
        }else System.out.printf("%s Please create account in our bank%n",customer.name());
    }

}
