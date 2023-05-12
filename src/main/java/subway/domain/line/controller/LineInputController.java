package subway.domain.line.controller;

import subway.domain.line.domain.Line;
import subway.domain.line.LineValidate;
import subway.domain.line.view.LineInputView;
import subway.domain.line.view.LineOutputView;
import subway.domain.station.domain.Station;

public class LineInputController {

    public static String startLineInput() {
        try {
            LineOutputView.mainLine();
            String input = LineInputView.startLineInput();
            LineValidate.validateLineMain(input);
            return input;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return startLineInput();
        }
    }

    public static String addLineName() throws IllegalArgumentException {
        String input = LineInputView.addLine();
        LineValidate.addLineValidate(input);
        return input;
    }

    public static Station addLineFirstStation() throws IllegalArgumentException {
        String input = LineInputView.startStationOfLine();
        return LineValidate.validateStationOfLineIsExist(input);
    }

    public static Station addLineLastStation(String start) throws IllegalArgumentException {
        String input = LineInputView.endStationOfLine();
        return LineValidate.validateEndStationOfLineIsExistAndNotDuplicate(input, start);
    }

    public static Line deleteLine() throws IllegalArgumentException {
        String input = LineInputView.deleteLine();
        return LineValidate.isDeletingInputLineExist(input);
    }
}
