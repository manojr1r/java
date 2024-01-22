package OOP.Constructor.Basics;
public class Basics {
    private int field1;
    private int a;
    public Basics(){
        // is the first code block executed if object is created
        // will not have return type
        // if constructor is private cannot create object see Example
        // Constructor chaining
        System.out.println("default constructor overloaded");
    }
    private Basics( int a){
//        Example for private constructor
        field1 = a;
    }

    /*
    Can use setter getter in constructor, but it is not recommended as it(setter method) may have not yet initialized.
    */
    public void setField1(int field1) {
        this.field1 = field1;
    }
    Basics(char  a){
        setField1(a);
    }


    /*
        Constructor overloading
         */
    public Basics (String a){

    }
    public Basics (double a){

    }
}
