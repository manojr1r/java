package Generics.WithoutGenerics;

public class Main {
    public static void main(String[] args) {
        BaseBallTeam sri = new BaseBallTeam("MarryLand");
        BaseBallTeam ven = new BaseBallTeam("Ohio");

        BaseballPlayer chitti = new BaseballPlayer("Chitti", "Right Fielder");
        var lohith = new BaseballPlayer("Lohith", "Left Fielder");

        var shiva = new BaseballPlayer("shiva", "Left Fielder");
        BaseballPlayer priyanaka = new BaseballPlayer("priyanaka", "Right Fielder");

        sri.addPlayer(shiva); sri.addPlayer(priyanaka);
        ven.addPlayer(chitti); ven.addPlayer(lohith);

        soreResult(sri, 3, ven, 5);
        ven.listTeamMembers();
        sri.listTeamMembers();

    }

    public static void soreResult(BaseBallTeam team1, int team1Score, BaseBallTeam team2, int team2Score){
        String message = team1.setScore(team1Score, team2Score);
        team2.setScore(team2Score, team1Score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
