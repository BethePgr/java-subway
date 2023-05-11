package subway.domain.section.service;

import static org.junit.jupiter.api.Assertions.*;

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

class SectionServiceTest {

    @BeforeEach
    void setUp(){
        StationInitialization.setInitialStations();
        LineInitialization.setInitialLines();
    }

    @Test
    @DisplayName("")
    void test1() throws Exception {

        Line lineTwo = SectionValidate.validateLineExist("2호선");
        Station station = SectionValidate.validateStationExist("매봉역");
        int num = 3;
        SectionService.addSection(lineTwo,station,num);

        for(Station stations : lineTwo.getStationList()){
            System.out.println(stations.getName());
        }
    }

}