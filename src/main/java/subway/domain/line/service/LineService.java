package subway.domain.line.service;

import java.util.List;
import subway.domain.line.domain.Line;
import subway.domain.line.domain.LineRepository;
import subway.domain.station.domain.Station;

public class LineService {

    public static void addLine(Line line) {
        LineRepository.addLine(line);
    }

    public static Line makeLine(String name, Station first, Station last) {
        Line line = new Line(name);
        line.addStations(first);
        line.addStations(last);
        return line;
    }

    public static void deleteLine(String name) {
        LineRepository.deleteLineByName(name);
    }

    public static List<Line> getLines() {
        return LineRepository.lines();
    }
}
