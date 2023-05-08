package subway.domain.station;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StationInitialization {

    private static String initialStations = "교대역,강남역,역삼역,남부터미널역,양재역,양재시민의숲역,매봉역";

    public static void setInitialStations(){
        List<String> stations = Arrays.stream(initialStations.split(","))
            .collect(Collectors.toList());
        for(String station : stations){
            StationRepository.addStation(new Station(station));
        }
    }
}
