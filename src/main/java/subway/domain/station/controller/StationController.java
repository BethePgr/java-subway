package subway.domain.station.controller;

import subway.domain.station.Station;
import subway.domain.station.service.StationService;
import subway.domain.station.view.StationOutputView;

public class StationController {

    public static void startStation(){
        StationOutputView.mainStation();
        while(true) {
            String input = StationInputController.startStationInput();
            if(input.equals("B")){
                break;
            }
            stationFunctions(input);
        }
    }

    private static void stationFunctions(String input){
        addStation(input);
        deleteStation(input);
        printAllStations(input);
    }

    private static void addStation(String input){
        if(input.equals("1")){
            String newStation = StationInputController.addStation();
            StationService.addStation(new Station(newStation));
            StationOutputView.addedStation();
        }
    }

    private static void deleteStation(String input){
        if(input.equals("2")){
            String deleteStation = StationInputController.deleteStation();
            StationService.deleteStation(deleteStation);
            StationOutputView.deletedStation();
        }
    }

    private static void printAllStations(String input){
        if(input.equals("3")){
            StationOutputView.printAllStations(StationService.getStations());
        }
    }

}
