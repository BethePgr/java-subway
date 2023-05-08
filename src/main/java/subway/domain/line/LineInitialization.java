package subway.domain.line;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import subway.domain.station.Station;

public class LineInitialization {

    private static final String secondLine = "2호선,교대역,강남역,역삼역";
    private static final String thirdLine = "3호선,교대역,남부터미널역,양재역,매봉역";
    private static final String shinBunDangLine = "신분당선,강남역,양재역,양재시민의숲역";

    public static void setInitialLines(){
        List<String> lineLists = new ArrayList<>(Arrays.asList(secondLine,thirdLine,shinBunDangLine));
        for(String line : lineLists){
            String[] lineInfo = line.split(",");
            Line oneLine = new Line(lineInfo[0]);
            for(int i = 1;i<lineInfo.length;i++){
                oneLine.addStations(new Station(lineInfo[i]));
            }
            LineRepository.addLine(oneLine);
        }
    }
}
