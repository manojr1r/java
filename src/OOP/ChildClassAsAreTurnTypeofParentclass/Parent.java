package OOP.ChildClassAsAreTurnTypeofParentclass;

public class Parent {
    private String type;
    private int num;
// parent class

    public Parent(String type, int num) {
        this.type = type;
        this.num = num;
    }

    public void parMethod() {
        System.out.println("Parent method");
    }

    public Parent createNewObject(String type, int num) {
        System.out.println("parent-class-Object-created-with-CreateNewObject");
        return new Parent(type, num);
    }

    @Override
    public String toString() {
        System.out.println("parent-class-ToString-sysout");
        return "Parent [type=" + type + ", num=" + num + "]";
    }
}