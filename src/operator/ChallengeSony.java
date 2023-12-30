package operator;

public class ChallengeSony {
    public static void main(String[] args) {
        double myFirstVariable = 20.00;
        double mySecondVariable = 80.00;
        double myValuesTotal = (myFirstVariable + mySecondVariable) * 100.00;
        double theRemainder = myValuesTotal % 40;  //Step 4

        boolean isNoRemainder = theRemainder == 0 ? true : false;  // Step 5

        System.out.println(isNoRemainder);

        if(!isNoRemainder )  //step 7
            System.out.println("got some theRemainder");

        int a = 10;
        if(a==10){
            System.out.println(a<5 ? "yes" :"no");

        }

    }
}
