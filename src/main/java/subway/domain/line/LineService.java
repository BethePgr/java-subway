package subway.domain.line;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import subway.domain.station.Station;

public class LineService {

    public static void addLine(Line line){
        LineRepository.addLine(line);
    }

    public static void deleteLine(String name){
        LineRepository.deleteLineByName(name);
    }
}
