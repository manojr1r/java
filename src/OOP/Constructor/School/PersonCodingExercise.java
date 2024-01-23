package OOP.Constructor.School;

public class PersonCodingExercise {
    // firstName, lastName of type String and age of type int.
    private String firstName, lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        //less than 0 or greater than 100, it needs to set the age field value to 0.
        if (age < 0 || age > 100){
            this.age = 0;
        }else {
            this.age = age;
        }
    }

    public boolean isTeen(){
//    it needs to return true if the value of the age field is greater than 12 and less than 20, otherwise, return false.
        return this.age > 12 && this.age < 20;
    }

    public String getFullName(){
//        firstName and lastName fields are empty, Strings return an empty String.
        if (this.firstName.isEmpty() && this.lastName.isEmpty())
            return "";
        else if (this.firstName.isEmpty())
            return this.lastName;
        else if (this.lastName.isEmpty()) {
            return this.firstName;
        }else return this.firstName + " " + this.lastName;
    }

}
