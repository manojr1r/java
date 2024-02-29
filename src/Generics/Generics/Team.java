package Generics.Generics;

import java.util.ArrayList;
import java.util.List;

public class Team < T extends Player , S > {
    /*"extends" keyword is going to be same either for Class or Interface
    *  is called Upper Bond
    * Check for listTeamMembers() method teamMember.name() can able to use only as upper-bond specified.,
    * if not, only Object class methods only can be used
    */
    private String teamName;
    private List<T> teamMembers = new ArrayList<>();
    private S two;
    private int score;    private int totalWins;    private int totalLosses;    private  int totalTies;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Team(String teamName, S two) {
        this.teamName = teamName;
        this.two = two;
    }

    public List<T> getTeamMembers() {
        return teamMembers;
    }

    public void addPlayer(T t ){
        if (!teamMembers.contains(t)){
            teamMembers.add(t);
        }
    }

    public String getTeamName() {
        return teamName;
    }

    public void listTeamMembers(){
        System.out.println(teamName+ " Rooster");
        for (T teamMember : teamMembers){
            System.out.println(teamMember.name());
        }
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

    public static String setScore(Team team1, int team1Score, Team team2, int team2Score){
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

    public void twoGenerics(){
        System.out.println(two);
    }
    @Override
    public String toString() {
        return teamName +" (Ranked "+ ranking() +") " ;
    }
}
