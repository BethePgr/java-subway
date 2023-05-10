package subway.domain.line.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import subway.domain.line.Line;
import subway.domain.line.LineRepository;
import subway.domain.station.Station;

public class LineService {

    public static void addLine(Line line){
        LineRepository.addLine(line);
    }

    public static void deleteLine(String name){
        LineRepository.deleteLineByName(name);
    }

    public static List<Line> getLines(){
        return LineRepository.lines();
    }
}
