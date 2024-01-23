package OOP.Constructor.School;

public class CustomerChallenge {
    private String name, emailId;
    private int creditLimit;
    public CustomerChallenge(){
        this (null, "email@.com", -1);
    }
    public CustomerChallenge(String name, String emailId){
        this (name, emailId, 1000);
    }
    public CustomerChallenge(String name, String emailId, int creditLimit){
        this.name = name;
        this.emailId = emailId;
        this.creditLimit = creditLimit;
    }
    public String getName(){
        return name;
    }

    public String getEmailId() {
        return emailId;
    }

    public int getCreditLimit() {
        return creditLimit;
    }



}
