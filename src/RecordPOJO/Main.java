package RecordPOJO;

import RecordPOJO.ImplicitEqual.JobHolders;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        StudentRecord amr = new StudentRecord("121","amr","19","java");
        StudentRecord amrSelenium = new StudentRecord("222","amr","19","Selenium");
        StudentRecord amrJavaSel = new StudentRecord("121","amr","19","java"); //same as amr record
        StudentRecord amrtester = new StudentRecord("321","amr","19","java");
        StudentRecord sunny = new StudentRecord("525","Sunny","5","Linux");
        StudentRecord sunnyDevops = new StudentRecord("525","Sunny","5","AWS");
        StudentRecord sunnyDev = new StudentRecord("525","Sunny","5","AWS");



        for (int i =0 ; i <5 ; i++){

        }


        /* for (int i = 1; i <= 5; i++) {
            Student student = new Student("S24"+i,
                    switch (i){
                case 1 -> "Manoj";
                case 2 -> "Vijay";
                case 3 -> "Hari";
                case 4 -> "Sagar";
                case 5 -> "Sunil";
                default -> "Uttam";
                    },
                    "1"+(i++)+" / "+(i--)+" / 1995",
                    "Manoj Class" );

            System.out.println(student);
        }

         */
    }



}
