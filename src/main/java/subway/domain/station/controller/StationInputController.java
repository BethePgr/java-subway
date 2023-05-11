package subway.domain.station.controller;

import subway.domain.station.view.StationInputView;
import subway.domain.station.StationValidate;
import subway.domain.station.view.StationOutputView;

public class StationInputController {

    public static String startStationInput() {
        try {
            StationOutputView.mainStation();
            String input = StationInputView.startStationInput();
            StationValidate.validateStationStartInput(input);
            return input;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return startStationInput();
        }
    }

    public static String addStation() throws IllegalArgumentException {
        String input = StationInputView.addStation();
        StationValidate.addStationValidate(input);
        return input;
    }

    public static String deleteStation() throws IllegalArgumentException {
        String input = StationInputView.deleteStation();
        StationValidate.deleteStationValidate(input);
        return input;
    }
}
