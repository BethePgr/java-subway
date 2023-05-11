package subway.domain.section;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import subway.domain.line.Line;
import subway.domain.line.LineRepository;
import subway.domain.line.LineValidate;
import subway.domain.station.Station;
import subway.domain.station.StationRepository;

public class SectionValidate {

    public static void validateSectionMain(String input){
        List<String> list = new ArrayList<>(Arrays.asList("1","2","B"));
        if(!list.contains(input)){
            throw new IllegalArgumentException("[ERROR] 지원하지 않는 기능입니다.");
        }
    }

    public static Station validateStationExist(String input){
        return LineValidate.validateStationOfLineIsExist(input);
    }

    public static Line validateLineExist(String input){
        return LineRepository.lines().stream().filter(line -> line.getName().equals(input)).findAny()
            .orElseThrow(() -> new IllegalArgumentException("[ERROR] 해당 노선은 존재하지 않습니다."));
    }

    public static int validateSectionOrder(Line line, String input){
        onlyNumber(input);
        notOverLineStationCounts(line, input);
        mustOveZero(input);
        return Integer.parseInt(input);
    }

    private static void onlyNumber(String input){
        String reg = "^[0-9]+";
        if(!input.matches(reg)){
            throw new IllegalArgumentException("[ERROR] 순서는 숫자로만 이루어져야 합니다.");
        }
    }

    private static void notOverLineStationCounts(Line line,String input){
        int size = line.getStationList().size();
        if(Integer.parseInt(input) > size + 1){
            throw new IllegalArgumentException("[ERROR] 순서는 호선의 역의 개수+1 보다 작거나 같아야 합니다.");
        }
    }

    private static void mustOveZero(String input){
        if(Integer.parseInt(input) < 1){
            throw new IllegalArgumentException("[ERROR] 순서는 1이상이여햐 합니다.");
        }
    }
}
