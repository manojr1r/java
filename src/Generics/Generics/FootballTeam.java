package Generics.Generics;

//class goalPerPlayer<T extends FootballPlayer>{
//    public int goalPerPlayer(T player){
////        player.name() = ;
// This Can achieved in HashMap I guess
//    }
//}

public class FootballTeam<T extends FootballPlayer> extends SportsTeam {
    private static int shotsPerGame;
    private int individualGoals;

    public FootballTeam(String name) {
        super(name);
    }

    public void goal( T player) {
        shotsPerGame++;
       player.name() ;
    }

    public int getShotsPerGame() {
        return shotsPerGame;
    }

    @Override
    public String toString() {
        return super.getTeamName() + " " + shotsPerGame;
    }
}
