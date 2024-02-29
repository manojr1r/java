package Generics.WithoutGenericsInterface;

public class Main {
    public static void main(String[] args) {
//        BaseBallTeam sriBase = new BaseBallTeam("MarryLand");
//        BaseBallTeam venFoot = new BaseBallTeam("Ohio");
        SportsTeam sriBase = new BaseBallTeam("Baseball Sports Team");   // Team instantiating
        SportsTeam venFoot = new SportsTeam("FootBall Sports Team");        // Team instantiating

        BaseballPlayer chitti = new BaseballPlayer("Chitti", "shooter"); //Sports Persons creation
        var shiva = new BaseballPlayer("shiva", "Left Fielder");
        var lohith = new FootballPlayer("Lohith", "Goal Keeper");
        FootballPlayer priyanaka = new FootballPlayer("priyanaka", "Center Forward");

        sriBase.addPlayer(shiva);  //adding sports players to add in Team
        sriBase.addPlayer(priyanaka);


        venFoot.addPlayer(chitti);
        venFoot.addPlayer(lohith);

        soreResult(sriBase, 3, venFoot, 5);

        venFoot.listTeamMembers();
//        sriBase.listTeamMembers();

    }

    public static void soreResult(SportsTeam team1, int team1Score, SportsTeam team2, int team2Score){
        String message = team1.setScore(team1Score, team2Score);
        team2.setScore(team2Score, team1Score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }


}
