package matchmanagement.entities;

import java.util.ArrayList;

public class SummonRift {
     private ArrayList<Team> team1;
     private ArrayList<Team> team2;
     private String startTime;

    public SummonRift(ArrayList<Team> team1, ArrayList<Team> team2, String startTime) {
        this.team1 = team1;
        this.team2 = team2;
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "SummonRift{" +
                "team1=" + team1 +
                ", team2=" + team2 +
                ", startTime='" + startTime + '\'' +
                '}';
    }
}

