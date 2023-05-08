package subway.controller;

import subway.validate.InputValidation;
import subway.view.InputView;

public class InputController {

    public static String inputStartCon(){
        try{
            String input = InputView.inputStart();
            InputValidation.validateStartInput(input);
            return input;
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            return inputStartCon();
        }
    }
}
