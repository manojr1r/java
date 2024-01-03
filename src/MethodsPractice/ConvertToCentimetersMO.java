package MethodsPractice;

public class ConvertToCentimetersMO {
    public static void main(String[] args) {
        System.out.println( convertToCentimeters (-12));
        System.out.println( convertToCentimeters (5,8));
    }
    public static double convertToCentimeters(int heightInInches){
        if (heightInInches<=0){          // Validation
            System.out.print("Please Enter Valid number greater than ");
            return 0;
        } else {
            return heightInInches * 2.54;
        }
    }

    public static double convertToCentimeters(int heightInFeet, int remainingInInches ){
        if (heightInFeet == 0 && remainingInInches == 0){ // Validation
            return 0;
        }
        int heightInInches = heightInFeet *12;
        int totalInches = heightInInches + remainingInInches;
        return convertToCentimeters (totalInches);
    }
}
