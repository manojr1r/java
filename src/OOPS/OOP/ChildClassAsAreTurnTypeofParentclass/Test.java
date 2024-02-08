package OOPS.OOP.ChildClassAsAreTurnTypeofParentclass;

public class Test{
    CharSequence show(){
        System.out.println("1");
        return null;
    }
}
class xyz extends Test{
    //won't compile
//As Parent is char and child class method is int will thro compile time error
    /*Integer show(){
        System.out.println("2");
        return null;
    }
     */
}
class yz extends Test{
    String show(){
        System.out.println("2");
        return null;
    }
}