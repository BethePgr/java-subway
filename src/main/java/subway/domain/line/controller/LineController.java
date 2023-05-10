package subway.domain.line.controller;

import subway.domain.line.Line;
import subway.domain.line.service.LineService;
import subway.domain.line.view.LineOutputView;
import subway.domain.station.Station;

public class LineController {

    public static void startLine(){
        while(true){
            String input = LineInputController.startLineInput();
            if(input.equals("B")){
                break;
            }
            lineFunctions(input);
        }
    }

    public static void lineFunctions(String input){
        addLine(input);
        deleteLine(input);
        printLines(input);
    }

    public static void addLine(String input){
        if(input.equals("1")){
            String lineName = LineInputController.addLineName();
            Station startStation = LineInputController.addLineFirstStation();
            Station endStation = LineInputController.addLineLastStation(startStation.getName());
            LineService.addLine(LineService.makeLine(lineName,startStation,endStation));
        }
    }

    public static void deleteLine(String input){
        if(input.equals("2")){
            Line line = LineInputController.deleteLine();
            LineService.deleteLine(line.getName());
        }
    }


    public static void printLines(String input){
        if(input.equals("3")){
            LineOutputView.printLines();
        }
    }
}
