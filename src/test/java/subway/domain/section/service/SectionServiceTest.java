package subway.domain.section.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import subway.domain.line.Line;
import subway.domain.line.LineInitialization;
import subway.domain.line.LineRepository;
import subway.domain.section.SectionValidate;
import subway.domain.station.Station;
import subway.domain.station.StationInitialization;
import subway.domain.station.StationRepository;

class SectionServiceTest {

    @BeforeEach
    void setUp() {
        StationInitialization.setInitialStations();
        LineInitialization.setInitialLines();
    }

    @Test
    @DisplayName("")
    void test1() throws Exception {

        Line lineTwo = SectionValidate.validateLineExist("2호선");
        Station station = SectionValidate.validateStationExist(lineTwo, "매봉역");
        int num = 3;
        SectionService.addSection(lineTwo, station, num);

        assertEquals(4, lineTwo.getStationList().size());
    }

    @Test
    @DisplayName("")
    void test2() throws Exception {

        Line lineTwo = SectionValidate.validateLineExist("2호선");
        Station station = SectionValidate.validateStationNotExist(lineTwo, "교대역");
        SectionService.deleteSection(lineTwo, station);
        assertEquals(2, lineTwo.getStationList().size());

    }
}


