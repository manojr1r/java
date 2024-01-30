package AMRself;

class Print {
//    https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Formatter.html
    public static void main(String[] args) {
//        System.out.println(1+2 +" addition of literals");
//        System.out.println(" "+( 1+2) +" addition of literals");
//        System.out.println(" "+ 1+2 +" addition of literals");
//        int a =1 , b=2;
//        System.out.println(a+b +" addition of variables");
//        System.out.println(" "+ (a+b) +" addition of variables");
//        System.out.println(" " + a+b +" addition of variables");

        String name = "Meghana";
        int year = 1947;
        int age =60;

        try {
            System.out.printf("My name is %s,\n %nand my age %d %n",name,age );
        }catch (Exception e){
            System.out.println(" ");
        }

        System.out.printf("DOB %d, and my age %d \n",year,age  );
        System.out.printf("DOB %d,", year,"and my age %d%n ",age  );
        System.out.printf("DOB %d, and my age %f \n",year,(float)age  ); //6 decimal precisions by default
        System.out.printf("DOB %d, and my age %9.2f \n",year,(float)age  );

        System.out.printf("DOB %6d, and my age %10d \n",year,age  );    //spaces before




    }
}
