package subway.domain.station.controller;

import subway.domain.line.Line;
import subway.domain.line.LineRepository;
import subway.domain.section.controller.SectionInputController;
import subway.domain.station.Station;
import subway.domain.station.StationRepository;
import subway.domain.station.service.StationService;
import subway.domain.station.view.StationOutputView;

public class StationController {

    public static void run() {
        String input = StationInputController.startStationInput();
        if (!input.equals("B")) {
            stationFunctions(input);
        }
    }

    private static void stationFunctions(String input) {
        addStation(input);
        deleteStation(input);
        printAllStations(input);
    }

    private static void addStation(String input) {
        if (input.equals("1")) {
            try {
                String newStation = StationInputController.addStation();
                StationService.addStation(new Station(newStation));
                StationOutputView.addedStation();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());

            }
        }
    }

    private static void deleteStation(String input) {
        if (input.equals("2")) {
            try {
                String deleteStation = StationInputController.deleteStation();
                StationService.deleteStation(deleteStation);
                StationOutputView.deletedStation();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void printAllStations(String input) {
        if (input.equals("3")) {
            StationOutputView.printAllStations(StationService.getStations());
        }
    }

}
