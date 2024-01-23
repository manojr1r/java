package OOP.ClassMethods;

public class Methods {
    String variable;
    public static void main(String[] args) {
//       non-static field (Class variable) cannot be accessed from Static method
        /* variable = "assign";
        System.out.println(variable); */
        Methods method = new Methods();
        method.variable = "assign";
        System.out.println("non static variable = "+ method.variable);

        checkStatic(); //This is static method of same class
        class2.class2Method(); /*This is static method of other class so no need to create object to call method
         but class name is required though */

    }

    public static void checkStatic(){
        // static method can't use "this" keyword as "this", refers to instance variable
        // this.variable = variable;
        System.out.println("This is static method of same class");

    }
}
class class2{
    public static void class2Method(){
        // static method can't use "this" keyword as "this", refers to instance variable
        // this.variable = variable;
        System.out.println("This is static method of other class");

    }
}