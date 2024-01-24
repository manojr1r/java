package Primitive;

public class Bascis {
    // 8 primitive data types
    //int is the default value in no.'s
    //double is default for floating no.'s

    public static void main(String[] args) {
        byte byteMinValue = Byte.MIN_VALUE;

/*    Even the below two lines are same,
        in the first line as the default value of java is int it will calculate in int, and it is not sure so need casting
        in second line it is literal value
 */
        byte median = (byte) (byteMinValue/2);  // casting   down-casting
        byte median1 = (-128/2);

//        System.out.println(Integer.SIZE);
        int intMinValue = Integer.MIN_VALUE;
        System.out.println(intMinValue);
        intMinValue = -2_14_74_83_648;  // Can use _ can't use ',' to break no.

        long longValue = 100;    // no need to add L if in 'int' range
        long longValue2 = 2_14_74_83_648L; // but here needed

        //float but // double is recommended
        float num = 5/2f;
        System.out.println(num);


    }
}
