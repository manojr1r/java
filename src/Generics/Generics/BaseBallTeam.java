package Generics.Generics;

public class BaseBallTeam  {
    private String name;
    private int battingAverage;

    public BaseBallTeam(String name) {
        this.name = name;
    }

    public void setBattingAverage(int battingAverage) {
        this.battingAverage = battingAverage;
    }

    public String toString() {
        return name + " " + battingAverage;
    }
}
