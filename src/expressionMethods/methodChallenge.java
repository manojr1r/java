package expressionMethods;

public class methodChallenge {
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
        if (playerScore >= 1000){
            return 1;
        }
        else if ((playerScore>=500 && playerScore<1000)){
            return 2;
        }
        else if (playerScore>=100 && playerScore<500){
            return 3;
        }
        else {
            return 4;
        }
    }
}
