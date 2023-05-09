package subway.domain.station;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StationValidate {

    public static void validateStationStartInput(String input){
        List<Object> list = new ArrayList<>(Arrays.asList("1","2","3","B"));
        if(!list.contains(input)){
            throw new IllegalArgumentException("[ERROR] 존재하지 않는 기능입니다.");
        }
    }

    public static void validateEndWithStationAndLengthOver3(String input){
        if(!input.endsWith("역") || input.length() < 3){
            throw new IllegalArgumentException("[ERROR] 역의 끝 글자는 역으로 끝나면서 이름은 역 제외 두 글자 이상입니다.");
        }
    }

    public static void validateNotDuplicate(String input){
        if(StationRepository.stations().contains(input)){
            throw new IllegalArgumentException("[ERROR] 중복된 이름의 역은 다시 등록될 수 없습니다.");
        }
    }
}