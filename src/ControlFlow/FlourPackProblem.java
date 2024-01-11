package ControlFlow;

public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(0,5,4));

    }
    public static boolean canPack(int bigCount,int smallCount,int goal) {

        bigCount *= 5;
        boolean canPack = false;

        if (bigCount + smallCount == goal) {
            canPack = true;
            return canPack;
        }


       for (int outerLoop = 0; smallCount + outerLoop <= goal ; outerLoop++ ) {
           bigCount /= 5;

           if (smallCount + (outerLoop*5) == goal) {
               canPack = true;
               break;
           }
           if (outerLoop == bigCount) {
               break;
           }
           System.out.println("outerLoop bigCount "+ bigCount);
           bigCount *= 5;

           for (int innerLoop = 0; bigCount + innerLoop <= goal ; innerLoop++){
               if (smallCount == 0){
                   continue;
               }

               System.out.println("inner loop bigCount "+ bigCount);
               if (bigCount + innerLoop == goal) {
                   canPack = true;
                   break;
               }
               if (innerLoop == smallCount ){
                   break;
               }

           }
       }


        return canPack;
    }
}
