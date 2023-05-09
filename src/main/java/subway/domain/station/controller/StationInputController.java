package subway.domain.station.controller;

import subway.domain.station.view.StationInputView;
import subway.domain.station.StationValidate;
import subway.domain.station.view.StationOutputView;

public class StationInputController {

    public static String startStationInput(){
        try{
            StationOutputView.mainStation();
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
            StationValidate.addStationValidate(input);
            return input;
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            return StationInputController.startStationInput();
        }
    }

    public static String deleteStation(){
        try{
            String input = StationInputView.deleteStation();
            StationValidate.deleteStationValidate(input);
            return input;
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            return StationInputController.startStationInput();
        }
    }
}
