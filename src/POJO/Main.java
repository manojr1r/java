package POJO;

public class Main {
    public static void main(String[] args) {

        StudentRecord s = new StudentRecord("121","amr","19","java");
        System.out.println(s.id());


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
