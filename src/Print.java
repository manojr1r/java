class Print {
//    https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Formatter.html

    /*
    System.out.printf and System.out.format will be the same
     */
    public static void main(String[] args) {
        int a =1 , b=2;
        System.out.println(a+b +" \"addition of variables\"");

        String name = "Meghana";
        int year = 1947;
        int age =60;

        System.out.printf("My name is %s,\n %nand my age %d %n",name,age ); //s or S for String %n new line

        System.out.printf("Current year %d + %d \"addition of variables will not apply here\"\n",year,age ); //Can we add?


        System.out.printf("DOB %d, and my age %d \n",year,age  );
        System.out.printf("DOB %d,", year,"and my age %d%n ",age  );
        System.out.printf("DOB %d, and my age %f \n",year,(float)age  ); //6 decimal precisions by default
        System.out.printf("DOB %d, and my age %9.2f \n",year,(float)age  );

        System.out.format ("DOB %6d, and my age %10d\n",year,age  );    //spaces before




    }
}
