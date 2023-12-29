package expressionMethods;

public class MethodChallenge {
    public static void main(String[] args) {
        int position;
        position =  calculateHighScorePosition(1500);
        displayHighScorePosition("Manoj", position);

        position =  calculateHighScorePosition(1000);
        displayHighScorePosition("Manoj", position);

        position =  calculateHighScorePosition(500);
        displayHighScorePosition("Manoj", position);

        position =  calculateHighScorePosition(100);
        displayHighScorePosition("Manoj", position);

        position =  calculateHighScorePosition(25);
        displayHighScorePosition("Manoj", position);
    }
    public static void displayHighScorePosition(String playerName,int  highScorePosition){
        System.out.println(playerName + " managed to get into position "+ highScorePosition +" on the high score list." );
    }

    public static int calculateHighScorePosition(int playerScore){

        int position = 4; // as default (else condition was 4) add default value on the top
        if (playerScore >= 1000){
            position = 1;
        }
        else if (playerScore >= 500 ){
                   position = 2;
        }
        else if (playerScore >= 100 ){
            position = 3;
        }
        return position;
    }
}
