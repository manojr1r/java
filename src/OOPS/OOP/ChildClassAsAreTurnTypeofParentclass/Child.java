package OOPS.OOP.ChildClassAsAreTurnTypeofParentclass;

public class Child extends Parent {

    private int age;

    public Child(String type, int num,int age) {
        super(type, num);
        this.age=age;
// TODO Auto-generated constructor stub
    }

    public int getAge() {
        return age;
    }

    public void ChildMethod() {
        System.out.println("Child method");
    }

    @Override
    public Child createNewObject(String type, int num) {
        int age = 8;;
        Child child = new Child(type, num, age);
        System.out.println("child-class-create");
        return child;
    }

    @Override
    public String toString() {
        System.out.println("child-class-sysout");
        return "Child [age=" + age + ", type=" + super.toString();
    }
    // line 56 of child-class is overriding line 23 of parent-class
    // the return types are different: Child - Parent
    // this is possible because class Child is a subtype of class Parent
}
