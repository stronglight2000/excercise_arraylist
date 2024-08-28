package matchmanagement;

import matchmanagement.entities.Figure;
import matchmanagement.entities.SummonRift;
import matchmanagement.entities.Team;
import matchmanagement.service.FigureService;
import matchmanagement.service.SummonRiftService;
import matchmanagement.service.TeamService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SummonRiftService summonRiftService = new SummonRiftService();
        SummonRift summonRift = summonRiftService.summonRift(scanner);
        System.out.println(summonRift);
    }
}
