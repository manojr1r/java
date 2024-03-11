package Collections.List.LinkedList.videoChallenge;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
   private static final LinkedList<places> placesToVisit = new LinkedList<>();
    public static void main(String[] args) {

        places();
//        System.out.println(placesToVisit);
        userInput();


    }

    private static void places() {
//        places adelaide = new places("Adelaide", 1374);
//        places aliceSprings = new places("Alice Springs", 2771);
//        places brisbane = new places("Brisbane", 917);
//        places darwin = new places("Darwin", 3972);
//        places melbourne = new places("Melbourne", 877);
//        places perth = new places("Perth", 3923);

        addPlace( new places("Sydney", 0) );
        addPlace( new places("Alice Springs", 2771) );
        addPlace( new places("Brisbane", 917) );
        addPlace( new places("Darwin", 3972) );
        addPlace( new places("Melbourne", 877) );
        addPlace( new places("Perth", 3923));


    }
    private static void addPlace(places place){
        int index = 0;
        for (places location : placesToVisit){
            if (place.distanceFromSydney() < location.distanceFromSydney()){
                placesToVisit.add(index, place);
                return;
            }
            index++;
        }
        placesToVisit.add(place);
    }
    private static void menu(){
        System.out.print("""
                    Available actions (Select word or letter)
                    (F)orward
                    (B)ackward
                    (L)ist Places
                    (M)enu
                    (Q)uit--""");
    }

    public static void userInput(){
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        var iterator = placesToVisit.listIterator();
        boolean forward = true;
        menu();

        while (!quitLoop) {
            String input = scanner.nextLine();
            if (!iterator.hasPrevious()) {
                System.out.println("Starting at: "+ iterator.next().town());
                forward = true;
            }
            if (!iterator.hasNext()) {
                System.out.println("Final : "+ iterator.previous().town());
                forward = false;
            }
            try {
                switch (input.toUpperCase().charAt(0)) {
                    case 'F' -> {
                        if(!forward){
                            iterator.next();
                            forward = true;
                        }
                        if (iterator.hasNext()) {
                            System.out.print("Selected forward, " );
                                    System.out.println(iterator.next().town());
                        } else{ System.out.println("You're at the last Stop");
                        quitLoop = true;}
                    }
                    case 'B' -> {
                        if(forward){
                            iterator.previous();
                            forward = false;
                        }
                        if (iterator.hasPrevious()) {
                            System.out.println("Moving back, "+iterator.previous().town());
                        }else {
                            System.out.println("You're at the starting Point, can only move ahead");
                        }
                    }
                    case 'L' -> System.out.println(placesToVisit);
                    case 'M' -> menu();
                    case 'Q' -> quitLoop = true;
                }
            } catch (StringIndexOutOfBoundsException e){
                menu();
            }
        }
    }

}
