package subway.domain.line.view;

import subway.domain.line.Line;
import subway.domain.line.LineRepository;
import subway.domain.station.Station;

public class LineOutputView {

    public static void mainLine(){
        System.out.println("## 노선 관리 화면\n"
            + "1. 노선 등록\n"
            + "2. 노선 삭제\n"
            + "3. 노선 조회\n"
            + "B. 돌아가기");
    }

    public static void printLines(){
        System.out.println("## 노선 목록");
        for(Line line : LineRepository.lines()){
            System.out.println("[INFO] " + line.getName());

        }
    }

}
