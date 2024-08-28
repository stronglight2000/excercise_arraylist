package matchmanagement.entities;

import java.util.ArrayList;

public class Team {
    private int id;
    private static int idAuto;
    private ArrayList<Figure> figures;

    public Team(ArrayList<Figure> figures) {
        this.id = idAuto++;
        this.figures = figures;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", figures=" + figures +
                '}';
    }
}
