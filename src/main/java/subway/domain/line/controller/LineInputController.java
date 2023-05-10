package subway.domain.line.controller;

import subway.domain.line.Line;
import subway.domain.line.LineRepository;
import subway.domain.line.LineValidate;
import subway.domain.line.view.LineInputView;
import subway.domain.line.view.LineOutputView;
import subway.domain.station.Station;
import subway.domain.station.StationRepository;

public class LineInputController {

    public static String startLineInput(){
        try{
            LineOutputView.mainLine();
            String input = LineInputView.startLineInput();
            LineValidate.validateLineMain(input);
            return input;
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            return startLineInput();
        }
    }

    public static String addLineName() throws IllegalArgumentException{
        String input = LineInputView.addLine();
        LineValidate.addLineValidate(input);
        return input;
    }

    public static Station addLineFirstStation() throws IllegalArgumentException{
        String input = LineInputView.startStationOfLine();
        //LineValidate.validateStationOfLineIsExist(input);
        return StationRepository.stations().stream().filter(station -> station.getName().equals(input)).findFirst()
            .orElseThrow(() -> new IllegalArgumentException("[ERROR] 해당 역은 존재하지 않는 역입니다."));
    }

    public static Station addLineLastStation(String start) throws IllegalArgumentException{
        String input = LineInputView.endStationOfLine();
        //LineValidate.validateEndStationOfLineIsExistAndNotDuplicate(input,start);
        return StationRepository.stations().stream().filter(station -> station.getName().equals(input)
            && !input.equals(start)).findAny()
            .orElseThrow(() -> new IllegalArgumentException("[ERROR] 해당 역은 존재하지 않는 역이거나 시작역과 달라야합니다."));
    }

    public static Line deleteLine() throws IllegalArgumentException{
        String input = LineInputView.deleteLine();
        return LineRepository.lines().stream().filter(line -> line.getName().equals(input)).findAny()
            .orElseThrow(() -> new IllegalArgumentException("[ERROR] 제거하려는 호선이 존재하지 않습니다."));
    }
}
