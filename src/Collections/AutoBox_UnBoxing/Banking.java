package Collections.AutoBox_UnBoxing;

public class Banking {
    public static void main(String[] args) {
        Customer amr = new Customer("Manoj" , 1000);
        Customer pramod = new Customer("pramod" , 1000);
        Bank hdfc = new Bank("hdfc");
        hdfc.addNewCustomers(amr , 100);

//        hdfc.addNewCustomers(pramod , 1000);
        hdfc.transaction(amr , 500);
        hdfc.transaction(pramod ,-300);

        hdfc.transactionList(amr);
        hdfc.transactionList(pramod);
    }

}
