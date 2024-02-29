package Generics.WithoutGenericsInterface;

public class FootballTeam implements Player{
    private String name;
    private int shotsPerGame;

    public FootballTeam(String name) {
        this.name = name;
    }

    public void setShotsPerGame(int shotsPerGame) {
        this.shotsPerGame = shotsPerGame;
    }

    @Override
    public String toString() {
        return name + " " + shotsPerGame;
    }
}
