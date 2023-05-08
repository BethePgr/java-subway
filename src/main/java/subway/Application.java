package subway;

import java.util.Scanner;
import subway.controller.SubwayController;
import subway.domain.line.LineInitialization;
import subway.domain.station.StationInitialization;

public class Application {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        StationInitialization.setInitialStations();
        LineInitialization.setInitialLines();

        SubwayController subwayController = new SubwayController();
        subwayController.run();
    }
}
