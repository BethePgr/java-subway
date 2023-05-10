package subway.domain.line.controller;

import subway.domain.line.LineValidate;
import subway.domain.line.view.LineInputView;
import subway.domain.line.view.LineOutputView;

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

    public static String addLineFirstStation() throws IllegalArgumentException{
        String input = LineInputView.startStationOfLine();
        LineValidate.validateStationOfLineIsExist(input);
        return input;
    }

    public static String addLineLastStation(String start) throws IllegalArgumentException{
        String input = LineInputView.endStationOfLine();
        LineValidate.validateEndStationOfLineIsExistAndNotDuplicate(input,start);
        return input;
    }
}
