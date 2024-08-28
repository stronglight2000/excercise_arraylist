package matchmanagement.service;

import matchmanagement.entities.Figure;

import java.util.ArrayList;
import java.util.Scanner;

import static matchmanagement.utills.Constant.NUMBEROFFIGURE;


public class FigureService {
    public ArrayList<Figure> inputFigure(Scanner scanner){
        ArrayList<Figure> figures = new ArrayList<>();
        System.out.println("Mời bạn nhập vào thông tin tướng");
        for(int i=0;i<NUMBEROFFIGURE;i++){
            System.out.println("Mời bạn nhập vào tên của vị tướng thứ " +(i+1));
            String name = scanner.nextLine();
            System.out.println("Mời bạn nhập vào vị tri của vị tướng:");
            String position = scanner.nextLine();
            Figure figure = new Figure(name,position);
            figures.add(figure);
        }
        return figures;
    }
}
