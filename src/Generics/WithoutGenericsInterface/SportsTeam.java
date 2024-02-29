package Generics.WithoutGenericsInterface;

import java.util.ArrayList;
import java.util.List;

public class SportsTeam {
    private String teamName;
    private List<Player> teamMembers = new ArrayList<>();
    private int score;    private int totalWins;    private int totalLosses;    private  int totalTies;

    public SportsTeam(String teamName) {
        this.teamName = teamName;
    }

    public List<Player> getTeamMembers() {
        return teamMembers;
    }

    public void addPlayer(Player player ){
        if (!teamMembers.contains(player)){
            teamMembers.add(player);
        }
    }

    public String getTeamName() {
        return teamName;
    }

    public void listTeamMembers(){
        System.out.println(teamName+ " Rooster");
        System.out.println(teamMembers);
    }
    public int ranking(){
        return (totalLosses * 2) + totalTies + 1;
    }
    public String setScore(int ourScore , int theirScore){
        String message = "lost to";
        if (ourScore > theirScore){
            totalWins++;
            message = "beat";
        } else if (ourScore == theirScore) {
            totalTies++;
            message = "tied";
        }else {
            totalLosses++;
        }
        return message;
    }


    public static String setScore(SportsTeam team1, int team1Score, SportsTeam team2, int team2Score){
        String message = " Lost to " ;
        if (team1Score > team2Score){
            team1.totalWins++;
            team2.totalLosses++;
            message = " Won on " ;
        } else if (team1Score == team2Score) {
            team1.totalTies++;
            team2.totalTies++;
            message =  " and scored equal and the match is Draw ";
        }else {
            team1.totalLosses++;
            team2.totalWins++;
//            System.out.println("team2.totalWins++ "+team2.totalWins++);
        }
        return team1+ message + team2;
    }



    @Override
    public String toString() {
        return teamName +" (Ranked "+ ranking() +") ";
    }
}
