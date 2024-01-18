package operator;

public class IfPractise {
    public static void main(String[] args) {
        boolean isAliean = false;
        if(false == true) {
            System.out.print("here it is compared with ==");
            System.out.println("This code will not be executed");
        }
        else if (isAliean = true){
            System.out.println("value is assigned to isAliean, not compared with 'True'");
        }

        String makeOfCar = "Tata";

        //TernaryOperator
        System.out.println ( makeOfCar == "Tatua" ? false : true);
    }
}
