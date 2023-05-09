package subway.domain.station.view;

import java.util.List;
import subway.domain.station.Station;

public class StationOutputView {

    public static void addStation(){
        System.out.println("## 등록할 역 이름을 입력하세요.");
    }

    public static void printAllStations(List<Station> stations){
        System.out.println("## 역 목록");
        for(Station station : stations){
            System.out.println("[INFO] " + station);
        }
    }

}
