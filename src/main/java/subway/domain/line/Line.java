package subway.domain.line;

import java.util.ArrayList;
import java.util.List;
import subway.domain.station.Station;

public class Line {
    private String name;
    private List<Station> stationLists = new ArrayList<>();

    public Line(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 추가 기능 구현
}
