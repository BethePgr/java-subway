package subway;

import java.util.Scanner;
import subway.controller.SubwayController;
import subway.domain.line.LineInitialization;
import subway.domain.station.StationInitialization;
import subway.domain.station.controller.StationController;

public class Application {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        SubwayController.run();
    }
}
