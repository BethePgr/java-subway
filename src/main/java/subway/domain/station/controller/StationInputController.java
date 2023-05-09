package subway.domain.station.controller;

import subway.domain.station.view.StationInputView;
import subway.domain.station.StationValidate;

public class StationInputController {

    public static String startStationInput(){
        try{
            String input = StationInputView.startStationInput();
            StationValidate.validateStationStartInput(input);
            return input;
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            return startStationInput();
        }
    }

    public static String addStation(){
        try{
            String input = StationInputView.addStation();
            StationValidate.validateEndWithStationAndLengthOver3(input);
            return input;
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            return addStation();
        }
    }

    public static String deleteStation(){
        try{
            String input = StationInputView.deleteStation();
            StationValidate.validateStationIsInLine(input);
            return input;
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            return deleteStation();
        }
    }
}
