package expressionMethods;

public class IfThenElseChallenge {
    public static void main(String[] args) {

    sonyMethod(true,800,5,100);
        sonyMethod(true, 10000, 8, 200);

    }

public static void sonyMethod(boolean gameOver,int score, int levelCompleted,int bonus) {


    if(gameOver){
        score += (levelCompleted * bonus);
        System.out.println("finalscore = " + score);
    }
}
}
