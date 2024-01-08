package ControlFlow;

public class IsPrimeForLoop {
    public static void main(String[] args) {

        int counter = 0;
        for(byte i =10 ; i<=50 && counter<3 ; i++){
// instead of using seprate if condition used counter in for condition
            if (isPrime(i)){
                System.out.println(i);
                counter++;
               /* if (counter == 3){
                    break;
                };*/
            }
        }
    }
    public static boolean isPrime(int wholeNumber){
         if (wholeNumber<=2 ){
             return wholeNumber ==2;
         }
        for(int divisior =2; divisior<=wholeNumber / 2; divisior++){
            if (wholeNumber % divisior == 0){
                return false;
            }
        }
        return true;
    }
}
