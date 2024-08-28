package matchmanagement.service;

import matchmanagement.entities.Figure;
import matchmanagement.entities.Team;

import java.util.ArrayList;
import java.util.Scanner;



public class TeamService {
    public ArrayList<Team> inputTeam1(Scanner scanner) {
        ArrayList<Team> team1 = new ArrayList<>();
            System.out.println("Mời bạn nhập vào thông tin của team thứ nhất:" );
            FigureService figureService = new FigureService();
            ArrayList<Figure> figures = figureService.inputFigure(scanner);
            Team team = new Team(figures);
            team1.add(team);




        return team1;
    }
    public ArrayList<Team> inputTeam2(Scanner scanner) {
        ArrayList<Team> team2 = new ArrayList<>();

            System.out.println("Mời bạn nhập vào thông tin của team thứ 2:");
            FigureService figureService = new FigureService();
            ArrayList<Figure> figures = figureService.inputFigure(scanner);
            Team team = new Team(figures);
            team2.add(team);



        return team2;
    }
}





