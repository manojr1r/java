package Collections.AutoBox_UnBoxing;

import java.util.ArrayList;
record Customer(String name, ArrayList<Double> transactions){
    public Customer(String name, double intialDeposit) {
        this(name.toUpperCase(), new ArrayList<>());
        transactions.add(intialDeposit);
    }
}
