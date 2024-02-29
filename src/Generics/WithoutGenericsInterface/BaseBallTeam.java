package Generics.WithoutGenericsInterface;

public class BaseBallTeam extends SportsTeam implements Player {

    private int battingAverage;

    public BaseBallTeam(String name) {
        super(name);
    }

    public void setBattingAverage(int battingAverage) {
        this.battingAverage = battingAverage;
    }

    public String toString() {
        return super.getTeamName() + " " + battingAverage;
    }
}
