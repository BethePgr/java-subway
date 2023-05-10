package subway.domain.section.controller;

import subway.domain.line.Line;
import subway.domain.section.SectionValidate;
import subway.domain.section.view.SectionInputView;
import subway.domain.section.view.SectionOutputView;
import subway.domain.station.Station;

public class SectionInputController {

    public static String startSectionInput(){
        try{
            SectionOutputView.sectionMain();
            String input = SectionInputView.startSectionInput();
            SectionValidate.validateSectionMain(input);
            return input;
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return startSectionInput();
        }
    }

    public static Line sectionInputLine() throws IllegalArgumentException{
        String lineName = SectionInputView.addSectionLineName();
        return SectionValidate.validateLineExist(lineName);
    }

    public static Station sectionInputStation() throws IllegalArgumentException{
        String stationName = SectionInputView.addSectionStationName();
        return SectionValidate.validateStationExist(stationName);
    }

    public static int sectionInputOrder(Line line) throws IllegalArgumentException{
        String order = SectionInputView.addSectionStationNameOrder();
        return SectionValidate.validateSectionOrder(line,order);
    }
}
