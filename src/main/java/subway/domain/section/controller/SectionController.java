package subway.domain.section.controller;

import subway.domain.line.Line;
import subway.domain.section.service.SectionService;
import subway.domain.section.view.SectionOutputView;
import subway.domain.station.Station;

public class SectionController {

    public static void run() {
        String input = SectionInputController.startSectionInput();
        if (!input.equals("B")) {
            sectionFunctions(input);
        }
    }

    public static void sectionFunctions(String input) {
        addSection(input);
        deleteSection(input);
    }

    public static void addSection(String input) {
        if (input.equals("1")) {
            try {
                Line line = SectionInputController.sectionInputLine();
                Station station = SectionInputController.sectionInputStation(line);
                int num = SectionInputController.sectionInputOrder(line);
                SectionService.addSection(line, station, num);
                SectionOutputView.sectionAdded();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void deleteSection(String input) {
        if (input.equals("2")) {
            try {
                Line line = SectionInputController.sectionInputDeleteLine();
                Station station = SectionInputController.sectionInputDeleteStation(line);
                SectionService.deleteSection(line, station);
                SectionOutputView.sectionDeleted();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
