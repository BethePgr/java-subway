package subway.domain.station.service;

import java.util.List;
import subway.domain.station.domain.Station;
import subway.domain.station.domain.StationRepository;

public class StationService {

    public static void addStation(Station station) {
        StationRepository.addStation(station);
    }

    public static void deleteStation(String name) {
        StationRepository.deleteStation(name);
    }

    public static List<Station> getStations() {
        return StationRepository.stations();
    }
}
