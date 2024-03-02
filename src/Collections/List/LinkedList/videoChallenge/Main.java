package Collections.List.LinkedList.videoChallenge;

import ControlFlow.SwitchStatementNATO;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
   private static LinkedList<places> placesToVisit = new LinkedList<>();
    public static void main(String[] args) {

        places();
        System.out.println(placesToVisit);
        userInput();


    }

    public static void places() {
//        places adelaide = new places("Adelaide", 1374);
//        places aliceSprings = new places("Alice Springs", 2771);
//        places brisbane = new places("Brisbane", 917);
//        places darwin = new places("Darwin", 3972);
//        places melbourane = new places("Melbourne", 877);
//        places perth = new places("Perth", 3923);

        placesToVisit.addAll(List.of ( new places("Sydney", 0), new places("Alice Springs", 2771),
            new places("Brisbane", 917), new places("Darwin", 3972),
            new places("Melbourne", 877), new places("Perth", 3923),
            new places("Adelaide", 1374) ));

    }
    public static void userInput(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.print("""
                    Available actions (Select word or letter)
                    (F)orward
                    (B)ackward
                    (L)ist Places
                    (M)enu
                    (Q)uit """);

            String input = scanner.nextLine();
            var itertaor = placesToVisit.listIterator(1);


            switch (input.toUpperCase().charAt(0)){

                case 'F' -> {if (itertaor.hasNext()){
                    System.out.println( itertaor.next());
                }
                }
                case 'B' -> {if (itertaor.hasPrevious()){
                    System.out.println(itertaor.previous());
                }
                }
                case 'L' -> System.out.println(placesToVisit);
                case 'M' -> userInput();
                case 'Q' -> flag = false;
            }

        }while (flag);


    }

}
