package subway.domain.section.service;

import java.util.Objects;
import subway.domain.line.Line;
import subway.domain.station.Station;

public class SectionService {

    public static void addSection(Line line, Station station,int num){
        line.getStationList().add(num-1,station);
    }

    public static void deleteSection(Line line,Station station){
        line.getStationList().removeIf(stations -> Objects.equals(station.getName(),stations.getName()));
    }
}
