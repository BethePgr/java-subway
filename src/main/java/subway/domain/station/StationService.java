package subway.domain.station;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StationService {

    public static void addStation(Station station){
        StationRepository.addStation(station);
    }

    public static void deleteStation(String name){
        StationRepository.deleteStation(name);
    }
}
