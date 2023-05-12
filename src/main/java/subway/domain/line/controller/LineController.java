package subway.domain.line.controller;

import subway.domain.line.domain.Line;
import subway.domain.line.service.LineService;
import subway.domain.line.view.LineOutputView;
import subway.domain.station.domain.Station;

public class LineController {

    public static void run() {
        String input = LineInputController.startLineInput();
        if (!input.equals("B")) {
            lineFunctions(input);
        }
    }

    public static void lineFunctions(String input) {
        addLine(input);
        deleteLine(input);
        printLines(input);
    }

    public static void addLine(String input) {
        if (input.equals("1")) {
            try {
                String lineName = LineInputController.addLineName();
                Station startStation = LineInputController.addLineFirstStation();
                Station endStation = LineInputController.addLineLastStation(startStation.getName());
                LineService.addLine(LineService.makeLine(lineName, startStation, endStation));
                LineOutputView.addedLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void deleteLine(String input) {
        if (input.equals("2")) {
            try {
                Line line = LineInputController.deleteLine();
                LineService.deleteLine(line.getName());
                LineOutputView.deletedLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    public static void printLines(String input) {
        if (input.equals("3")) {
            LineOutputView.printLines();
        }
    }
}
