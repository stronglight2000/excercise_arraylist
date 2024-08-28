package matchmanagement.service;

import matchmanagement.entities.SummonRift;
import matchmanagement.entities.Team;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Scanner;

public class SummonRiftService {
    public SummonRift summonRift(Scanner scanner){
        System.out.println("Mời bạn nhập thời gian trận đấu bắt đầu");
        String starTime = scanner.nextLine();
        TeamService teamService = new TeamService();
        ArrayList<Team> team1 = teamService.inputTeam1(scanner);
        ArrayList<Team> team2 = teamService.inputTeam2(scanner);
        SummonRift summonRift = new SummonRift(team1,team2,starTime);


        return summonRift;
    }
}
