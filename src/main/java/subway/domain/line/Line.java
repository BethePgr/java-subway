package subway.domain.line;

import java.util.ArrayList;
import java.util.List;
import subway.domain.station.Station;

public class Line {

    private String name;
    private List<Station> stationList = new ArrayList<>();

    public Line(String name) {
        this.name = name;
    }

    public void addStations(Station station) {
        stationList.add(station);
    }

    public String getName() {
        return name;
    }

    public List<Station> getStationList() {
        return stationList;
    }
}
