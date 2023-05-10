package subway.domain.line;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import subway.domain.station.StationRepository;

public class LineValidate {

    public static void validateLineMain(String input){
        List<String> list = new ArrayList<>(Arrays.asList("1", "2", "3", "B"));
        if(!list.contains(input)){
            throw new IllegalArgumentException("[ERROR] 지원되지 않는 기능입니다.");
        }
    }

    public static void addLineValidate(String input){
        validateDuplicateLineName(input);
        validateLineEndsWithSunAndOverThree(input);
    }

    private static void validateDuplicateLineName(String input){
        if(LineRepository.lines().stream().anyMatch(line -> line.getName().equals(input))){
            throw new IllegalArgumentException("[ERROR] 중복된 이름의 노선을 추가할 수는 없습니다.");
        }
    }

    private static void validateLineEndsWithSunAndOverThree(String input){
        if(!input.endsWith("선") || input.length() < 3){
            throw new IllegalArgumentException("[ERROR] 노선의 이름은 선으로 끝나면서 선 제외 2 글자 이상이여야 합니다.");
        }
    }

    public static void validateStationOfLineIsExist(String input){
        if(StationRepository.stations().stream().noneMatch(station -> station.getName().equals(input))){
            throw new IllegalArgumentException("[ERROR] 해당 역은 존재하지 않는 역입니다.");
        }
    }

    public static void validateEndStationOfLineIsExistAndNotDuplicate(String input,String start){
        validateStationOfLineIsExist(input);
        if(input.equals(start)){
            throw new IllegalArgumentException("[ERROR] 시작역과 종착역은 달라야합니다.");
        }
    }
}
