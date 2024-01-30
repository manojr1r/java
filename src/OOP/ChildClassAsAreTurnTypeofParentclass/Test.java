package OOP.ChildClassAsAreTurnTypeofParentclass;

public class Test{
    CharSequence show(){
        System.out.println("1");
        return null;
    }
}
class xyz extends Test{
    //won't compile

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