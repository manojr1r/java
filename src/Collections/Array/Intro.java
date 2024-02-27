package Collections.Array;

import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {
// Cannot delete from Collections.Array
//    three ways to initialize Collections.Array
        int[] a = new int[5]; /* 1st */  /* "[]" both sides*/
        a[0] = 3;
        System.out.println( a.length);
        RandomArray[] b = new RandomArray[2];  /* will accept Classes and primitives */
        //**************************
        int ab[] = new int[1];  // 'C' type array declaration

        //**********************************
        String[] cd = new String[] {"a", "b"}; /* 3rd type */
        /* No "number" to declare size */ /* Only if known all the elements */
        String[] c = {"a", "b", "c"};   /* 3.1 type */  /* Anonymous array can only use while declaration*/
        System.out.println(c.toString());      //prints hex-decimal
        System.out.println(Arrays.toString(c));  // actual variables

        RandomArray ar = new RandomArray();
        int[] am = RandomArray.generate(5);
        Object objectArray = am;
        System.out.println(objectArray);

        System.out.println(Arrays.toString(am));


    }
}