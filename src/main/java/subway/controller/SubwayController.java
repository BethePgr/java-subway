package subway.controller;

import subway.domain.line.Line;
import subway.domain.line.LineRepository;
import subway.domain.line.LineService;
import subway.domain.station.Station;
import subway.domain.station.StationRepository;
import subway.domain.station.StationService;

public class SubwayController {

    public void run(){
        InputController.inputStartCon();

        for(Line line : LineRepository.lines()){
            System.out.println("LineRepository.lines = " + line.getName());
            for(Station station : line.getStationList()){
                System.out.println(station.getName());
            }
        }

        for(Station station : StationRepository.stations()){
            System.out.println("StationRepository.stations = " + station.getName());
        }
    }

}
