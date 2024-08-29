package matchmanagement.entities;

import java.util.ArrayList;

public class SummonRift {
     private ArrayList<Team> SKT;
     private ArrayList<Team> G2;
     private String startTime;

    public SummonRift(ArrayList<Team> SKT, ArrayList<Team> G2, String startTime) {
        this.SKT = SKT;
        this.G2 = G2;
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "SummonRift{" +
                "team1=" + SKT +
                ", team2=" + G2 +
                ", startTime='" + startTime + '\'' +
                '}';
    }
}

