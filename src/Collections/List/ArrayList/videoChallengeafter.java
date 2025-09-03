package Collections.List.ArrayList;
import java.util.*;

public class videoChallengeafter {

    private final Scanner scanner= new Scanner(System.in);
    private final ArrayList<String> groceryList = new ArrayList<>();

    public static void main(String... args){
        videoChallengeafter videoChallenge = new videoChallengeafter();
        try {
            while (true){
                String valueEntered = videoChallenge.userInput();
                if (valueEntered.equals("0")){
                    System.out.println(videoChallenge.groceryList);
                    break;
                }
                videoChallenge.actions(valueEntered);
            }
        }finally {
            videoChallenge.scanner.close();
        }

    }

    private String userInput() {
        System.out.print("Please Enter a value from 0, 1, 2: ");
        return scanner.nextLine().trim();
    }

    private void actions(String valueEntered){
        switch (valueEntered) {
            case "1" ->  addList();
            case "2" -> removeList();
            default ->
                System.out.println("Invalid input. Please enter 0 (exit), 1 (add), or 2 (remove).");
        }
    }

    private void removeList() {
        System.out.print("Enter grocery item to Remove: ");
        String groceryItem = scanner.nextLine();

        if(groceryItem.isBlank()){
            System.out.println("can't be empty");
            return;
        }

        if (groceryList.contains(groceryItem)){
            groceryList.remove(groceryItem);
            groceryList.sort(Comparator.naturalOrder());
        }else {
            System.out.println("item doesn't exist");
        }
        System.out.println(groceryList);
    }


    private void addList() {
        System.out.print("Enter grocery items to add with \",\" in between: ");
        String groceryItem = scanner.nextLine();
        if (groceryItem.isBlank()) {
            System.out.println("can't be empty");
            return;
        }
        String[] thisItems = groceryItem.split(",");

        for (String thisItem : thisItems) {
            thisItem = thisItem.trim();
            if (thisItem.isBlank()){
                continue;
            }
            if (!(groceryList.contains(thisItem))) {
                groceryList.add(thisItem);
                groceryList.sort(Comparator.naturalOrder());
            }
        }
        System.out.println(groceryList);
    }
}