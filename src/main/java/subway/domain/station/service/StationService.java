package subway.domain.station.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import subway.domain.station.Station;
import subway.domain.station.StationRepository;

public class StationService {

    public static void addStation(Station station){
        StationRepository.addStation(station);
    }

    public static void deleteStation(String name){
        StationRepository.deleteStation(name);
    }
}
