package AMRself;

import java.util.Scanner;

public class LoveCalculator {
    public static void main(String[] args) {
        loveCalculator();
    }

    private static void loveCalculator() {
        String[] names  = collectNames();
        int love_score;
        StringBuilder scoreForEach = new StringBuilder();
        for (String name : names){
            scoreForEach.append(calculateScore(name));
        }
        love_score = Integer.parseInt(scoreForEach.toString());
        printMessage(love_score);
    }

    private static  int calculateScore(String name) {
        int invscore =0;

        char[] letters = name.toUpperCase().toCharArray();
        for (char letter : letters){
            String love = "TRUE LOVE";
            for (char word :love.toCharArray()){
                if (letter == word){
                    invscore += 1;
                }
            }
        }
        return invscore;
    }

    private static String[] collectNames() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String yourName =  scanner.nextLine();
        System.out.print("Enter your partner name: ");
        String partnerName =  scanner.nextLine();
        return new String[]{yourName, partnerName};
    }

    private static void printMessage(int love_score ){

        if ((love_score < 10) || (love_score > 90)) {
            System.out.printf("Your score is %s, you go together like coke and mentos.", love_score);
        } else if ((love_score > 40) && (love_score < 50)) {
            System.out.printf("Your score is %s, you are alright together.", love_score);
        }  else{
           System.out.printf("Your score is %s.", love_score);
        }
    }
}
