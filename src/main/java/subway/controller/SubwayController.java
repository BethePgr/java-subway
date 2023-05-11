package subway.controller;

import subway.domain.line.Line;
import subway.domain.line.LineInitialization;
import subway.domain.line.LineRepository;
import subway.domain.line.controller.LineController;
import subway.domain.section.controller.SectionController;
import subway.domain.station.Station;
import subway.domain.station.StationInitialization;
import subway.domain.station.StationRepository;
import subway.domain.station.controller.StationController;
import subway.view.OutputView;

public class SubwayController {

    public static void run(){
        StationInitialization.setInitialStations();
        LineInitialization.setInitialLines();
        play();
    }


    public static void play(){
        while(true){
            String input = InputController.inputStartCon();
            if(input.equals("Q")){
                break;
            }
            subwayFunction(input);
        }
    }

    public static void subwayFunction(String input){
        stationCon(input);
        lineCon(input);
        sectionCon(input);
        printAll(input);
    }

    public static void stationCon(String input){
        if(input.equals("1")){
            StationController.run();
        }
    }
    public static void lineCon(String input){
        if(input.equals("2")){
            LineController.run();
        }
    }
    public static void sectionCon(String input){
        if(input.equals("3")){
            SectionController.run();
        }
    }
    public static void printAll(String input){
        if(input.equals("4")){
            OutputView.printAllLinesAndStations();
        }
    }
}
