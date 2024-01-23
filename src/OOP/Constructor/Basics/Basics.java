package OOP.Constructor.Basics;
public class Basics {
    private String name;
    private String lastName;
    private int classNo;

    public Basics(){
        // is the first code block executed if object is created
        // will not have return type
        // if constructor is private cannot create object see Example
        // Constructor overloading && Constructor chaining is possible
        this ("AMR");
        /* Above is constructor chaining
        * "this" should be the first line of the constructor
        * "super" (used for inheritance to send values to parent class)...
        *  and "this" can't be in one single constructor as both try to be in first line to execute*/
        System.out.println("default constructor overloaded chaining completed");
        System.out.println();
    }
    private Basics( int classNo){
//        Example for private constructor
        this.classNo = classNo;
    }

    /*
    Can use setter getter in constructor, but it is not recommended as it(setter method) may have not yet initialized.
    */
    public void setClassNo(int rollNo) { /* setter */
        this.classNo = rollNo;
    }
    Basics(String name){
        this(0, name, null);
        System.out.println("String constructor called roll no and name constructor");
        System.out.println("Code duplication of assigning values is reduced, " +
                "but all names received by default as 0 value, which is also default field value" );
    }
    Basics(int rollNo, String name, String lastName){
        this.name = name;
        this.lastName = lastName;
        setClassNo(rollNo); // setter method used, which is not suggested to use in constructor
        System.out.println("int and 2 String constructor completed" + this.name +" " + this.lastName);

    }

}
