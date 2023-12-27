package expressionMethods;

public class BarkingDog {
    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true, 23));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        return barking && hourOfDay>=0 && (hourOfDay<8 || hourOfDay==23);

/*
        // the below code is not required


        // if the hourOfDay is less than 0 or greater than 23, it's not
        // valid, so return false
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        // if the dog is barking, and it's before 8am or after 10pm,
        // then you should wake up.
       return barking && (hourOfDay < 8 || hourOfDay > 22);
*/
/*
     /////////////////////////////////////////
        // the below code is not required
      else if (!barking) {
            barking = false;
        }
        else if ((hourOfDay < 8 ) || (hourOfDay > 22 )) {
            barking = true;
        }else if ((hourOfDay > 8 ) || (hourOfDay < 22 ))
            barking = false;
        return barking;
 */
    }
}
