package OOPS.GetInstance;

public class School {

    public void getClasss() {
        System.out.println(this.getClass());
    }

    public void getSimpleNameee() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println(this);

    }
}
