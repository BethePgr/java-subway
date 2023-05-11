package subway.view;

import subway.domain.line.Line;
import subway.domain.line.LineRepository;
import subway.domain.station.Station;

public class OutputView {

    public static void printMain(){
        System.out.println("\n## 메인 화면\n"
            + "1. 역 관리\n"
            + "2. 노선 관리\n"
            + "3. 구간 관리\n"
            + "4. 지하철 노선도 출력\n"
            + "Q. 종료");
        System.out.println();
    }

    public static void printAllLinesAndStations(){
        for(Line line : LineRepository.lines()){
            System.out.println("[INFO] " + line.getName());
            System.out.println("[INFO] ---");
            printAllStationsOfOneLine(line);
        }
    }

    public static void printAllStationsOfOneLine(Line line){
        for(Station station : line.getStationList()){
            System.out.println("[INFO] " + station.getName());
        }
        System.out.println();
    }
}
