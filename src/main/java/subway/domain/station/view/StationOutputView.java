package subway.domain.station.view;

import java.util.List;
import subway.domain.station.Station;

public class StationOutputView {

    public static void mainStation(){
        System.out.println("## 역 관리 화면\n"
            + "1. 역 등록\n"
            + "2. 역 삭제\n"
            + "3. 역 조회\n"
            + "B. 돌아가기");

    }

    public static void addedStation(){
        System.out.println("[INFO] 지하철 역이 등록되었습니다.");
    }

    public static void deletedStation(){
        System.out.println("[INFO] 지하철 역이 삭제되었습니다.");
    }
    public static void addStation(){
        System.out.println("## 등록할 역 이름을 입력하세요.");
    }

    public static void printAllStations(List<Station> stations){
        System.out.println("## 역 목록");
        for(Station station : stations){
            System.out.println("[INFO] " + station.getName());
        }
    }

}
