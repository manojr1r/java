package AMRself;

public class EqualsObj {
    String a ;
    public static void main(String[] args) {
        EqualsObj obj1 = new EqualsObj();
        EqualsObj obj2 = new EqualsObj();

        EqualsObj obj3 =  obj1;

        if (obj1 == obj2){
            System.out.println("==");
        }
        if (obj1 == obj1){
            System.out.println(" obj1 == obj1");
        }
        if (obj1 == obj3){
            System.out.println(" obj1 == obj3");
        }
        if (obj1.equals( obj2)){
            System.out.println("equals, implemented ==");
        }

        String one = "one";
        String one1 = new String("one");
        String one2 = one;
        if (one == one1){
            System.out.println("one == one1 used new");
        }else {
            System.out.println("even used same string, As \'new\', else executed");
        }
        if (one == one2){
            System.out.println("one == one2 used same reference");
        }
    }
}
