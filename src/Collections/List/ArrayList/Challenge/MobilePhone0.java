package Collections.List.ArrayList.Challenge;

import java.util.ArrayList;

public class MobilePhone0 {
    private String myNumber;
    private ArrayList <Contact> myContacts ;

    public MobilePhone0(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }
    public boolean addNewContact(Contact contact){
//        has one parameter of type Contact and returns a boolean.
//        Returns true if the contact doesn't exists,
//        or false if the contact already exists.
        if (findContact(contact.getName()) >= 0){
            return false;
        }
        myContacts.add(contact);
        return true;


    }

   public boolean updateContact(Contact oldContact, Contact newContact){
//    has two parameters of type Contact (the old contact that will be updated with the new contact) and returns a boolean.
//    Returns true if the contact exists and was updated successfully,
//    or false if the contact doesn't exists.

       if (findContact(oldContact) >= 0 && findContact(newContact) < 0){
           myContacts.set(findContact(oldContact) ,newContact);
           return true;
       }
       return false;

    }

    public boolean removeContact(Contact contact) {
//    has one parameter of type Contact and returns a boolean.
//    Returns true if the contact exists and was removed successfully,
//    or false if the contact doesn't exists.

        if (findContact(contact) >= 0){
            myContacts.remove(contact);
            return true;
        }
        return false;
    }
    private int findContact(Contact contact){
//        has one parameter of type Contact and returns an int.
//        The returned value is it's position in the ArrayList,
//        it will either be -1 (doesn't exists) or a value greater than or equal to 0 (does exists)
         return findContact(contact.getName());
    }

    private int findContact(String name){
//         findContact(), same as above, only it has one parameter of type String
        for (int i=0; i<myContacts.size(); i++){
           Contact contact = myContacts.get(i);
           if (contact.getName().equalsIgnoreCase(name)){
            return i;
           }
        }
        return -1;

    }
    public Contact queryContact(String name){
//        has one parameter of type String and returns a Contact.
//        Use the String to search for the name and then return the Contact.
//        Return null otherwise.
        int index = findContact(name);
        if (index == -1) {
            return  null;
        }
        System.out.println( this.myContacts.get(index));
        return myContacts.get(index);
    }

    public void printContacts(){
        System.out.println("Contact Collections.List:");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + ". " +
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNumber());
        }
//        System.out.println(myContacts.get(0).getName());
    }
}
