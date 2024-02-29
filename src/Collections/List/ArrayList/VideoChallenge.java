package Collections.List.ArrayList;

import java.util.*;

public class VideoChallenge {
    private static ArrayList<String> listInput = new ArrayList<>();
    private static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {

        userInput();
        System.out.println(listInput);
    }

    private static void userInput() {
        boolean flag = true; int input =-1 ;
//        Scanner scanner =new Scanner(System.in);
        do {
            System.out.print("""
                0 -> to Close
                1 -> to add items to list
                2 -> to remove the item from the list
                Enter a number for which action you want to do :""");
            try {
                input = Integer.parseInt( scanner.nextLine());
            }
            catch (Exception e){
                System.out.println("Please Enter no. from above ");
                input = Integer.parseInt(scanner.nextLine());
            }
            switch (input) {
                case 0 -> flag = false;
                case 1 -> addInput();
                case 2 -> removeValues();
            }
        }while (flag);
    }

    public static void addInput(){
//        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter items to add with \",\" in between ");
        String input = scanner.nextLine();
        String[] inputToArray = (input.split(","));
        for (String value : inputToArray){
            value = value.trim();
//            if (listInput.contains(value)){
//            }
//            else{
//                listInput.add(value);
//            }
            if (!(listInput.contains(value))){
                listInput.add(value);
            }

        }
        listInput.sort(Comparator.naturalOrder());
        System.out.println("Current Collections.List "+listInput);

    }
    public static void removeValues(){
//        Scanner scanner =new Scanner(System.in);
        System.out.println("values to remove from the list \",\" in between ");
        String input = scanner.nextLine();
        String[] inputtoArray = input.split(",") ;
        listInput.removeAll(List.of(inputtoArray));
        listInput.sort(Comparator.naturalOrder());
        System.out.println("Current Collections.List "+listInput);
    }
}
