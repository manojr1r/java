package ControlFlow;

public class FlourPackProblem {
    public static void main(String[] args) {
//        System.out.println("false "+canPack(1,0,4));
//        System.out.println("true " + canPack(1,0,5));
//        System.out.println("false "+canPack(1,0,6));
//        System.out.println("true "+ canPack(0,5,4));
//        System.out.println("true "+canPack(2,2,11));
//        System.out.println("false "+canPack(-3,2,12));
//        System.out.println("true "+canPack(1,6,6));
//        System.out.println("True " + canPack(0,5,4) );
//        System.out.println("True " + canPack(0,5,5) );
//        System.out.println("True " + canPack(3,0,15) );
//        System.out.println("True "+ canPack(4,18,19));
//        System.out.println("True "+ canPack(6,2,17));
    }

    public static boolean canPack(int bigCount,int smallCount,int goal) {
        final int bigCountRepresent = 5;
        boolean canPack = false;
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return canPack;
        }

        for (int outerLoop =0 ; outerLoop<=bigCount; outerLoop++ ){
            for (int innerLoop = 0; innerLoop<= smallCount; innerLoop++){
                if ((outerLoop*bigCountRepresent) + innerLoop == goal){
                    canPack =true;
                    return canPack;
                }
            }
        }

        return canPack;
    }
}
