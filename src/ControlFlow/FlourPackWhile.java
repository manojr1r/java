package ControlFlow;

public class FlourPackWhile {
    public static void main(String[] args) {
        System.out.println("false "+canPack(1,0,4));
        System.out.println("true " + canPack(1,0,5));
        System.out.println("false "+canPack(1,0,6));
        System.out.println("true "+ canPack(0,5,4));
        System.out.println("true "+canPack(2,2,11));
        System.out.println("false "+canPack(-3,2,12));
        System.out.println("true "+canPack(1,6,6));
        System.out.println("True " + canPack(0,5,4) );
        System.out.println("True " + canPack(0,5,5) );
        System.out.println("True " + canPack(3,0,15) );
        System.out.println("True "+ canPack(4,18,19));
        System.out.println("True "+ canPack(6,2,17));
    }
    public static boolean canPack(int bigCount,int smallCount,int goal) {
        final int bigCountRepresent = 5;
        boolean canPack = false;
        int outerLoop = 0;
        int innerLoop = 0;
        boolean finished = false;
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return canPack;
        }

        while (((outerLoop * bigCountRepresent) + innerLoop <= goal) ) {
            if (finished){
                break;
            }

            while ((outerLoop * bigCountRepresent) + innerLoop <= goal ) {
                if ((outerLoop * bigCountRepresent) + innerLoop == goal) {
                    canPack = true;
                    finished = true;
                    return canPack;
                }
                if (innerLoop == smallCount && outerLoop == bigCount) {
                    finished = true;
                    break;
                }
                if (innerLoop == smallCount ) {
                    innerLoop =0;
                    break;
                }
                if (innerLoop < smallCount) {
                    innerLoop++;
                }
            }
            if (outerLoop < bigCount) {
                outerLoop++;
            }
        }
        return canPack;
    }
}
