package subway.controller;

import subway.domain.line.Line;
import subway.domain.line.LineRepository;
import subway.domain.line.controller.LineController;
import subway.domain.section.controller.SectionController;
import subway.domain.station.Station;
import subway.domain.station.StationRepository;
import subway.domain.station.controller.StationController;

public class SubwayController {

    public static void run(){
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
        LineCon(input);
        SectionCon(input);
    }

    public static void stationCon(String input){
        if(input.equals("1")){
            StationController.run();
        }
    }
    public static void LineCon(String input){
        if(input.equals("2")){
            LineController.run();
        }
    }
    public static void SectionCon(String input){
        if(input.equals("3")){
            SectionController.run();
        }
    }
}
