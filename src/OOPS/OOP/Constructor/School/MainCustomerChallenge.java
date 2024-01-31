package OOPS.OOP.Constructor.School;

public class MainCustomerChallenge {
    public static void main(String[] args) {
        CustomerChallenge customer = new CustomerChallenge();
        System.out.println( customer.getName() +" "+ customer.getEmailId()+ " " + customer.getCreditLimit());

        CustomerChallenge amr = new CustomerChallenge("AMR","amr@mail.com");
        System.out.println( amr.getName() +" "+ amr.getEmailId()+ " " + amr.getCreditLimit());

        CustomerChallenge customer1 = new CustomerChallenge("richard","richard@mail.com",820);
        System.out.println( customer1.getName() +" "+ customer1.getEmailId()+ " " + customer1.getCreditLimit());
    }
}
