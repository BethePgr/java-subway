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

}
