package Generics.Generics;

interface Player  {
    String name();
}

record BaseballPlayer(String name, String position) implements Player {
}
record FootballPlayer(String name, String position) implements Player {
    static int goal;
}
public class Main {
    public static void main(String[] args) {

        SportsTeam<BaseballPlayer> sriBase = new SportsTeam<>("Baseball Sports Team");// Team instantiating informing contains BASEBALL PlAYERS
        SportsTeam team = new SportsTeam("General Sports Team!!");


        FootballPlayer chitti = new FootballPlayer("Chitti", "shooter"); //Sports Persons creation
        var shiva = new BaseballPlayer("shiva", "Left Fielder");

        sriBase.addPlayer(shiva);  //adding sports players to add in Team
//      sriBase.addPlayer(chitti);   //Will throw an error as adding baseballPlayer to football

        team.addPlayer(shiva);
        team.addPlayer(chitti);

//        soreResult(sriBase, 3, venFoot, 5);

        sriBase.listTeamMembers();
        System.out.print("team without use of Generics 'Raw Usage'");
        team.listTeamMembers();

    }

    public static void soreResult(SportsTeam team1, int team1Score, SportsTeam team2, int team2Score){
        String message = team1.setScore(team1Score, team2Score);
        team2.setScore(team2Score, team1Score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }


}
