package subway.domain.station.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import subway.domain.line.LineInitialization;
import subway.domain.station.Station;
import subway.domain.station.StationInitialization;
import subway.domain.station.StationValidate;
import subway.domain.station.controller.StationInputController;

class StationServiceTest {

    @BeforeEach
    void setUp(){
        StationInitialization.setInitialStations();
        LineInitialization.setInitialLines();
    }

    @Test
    @DisplayName("이미 있는 역은 추가하려하면 에러가 뜬다.")
    void test() throws Exception {
        assertThrows(IllegalArgumentException.class,() -> StationValidate.addStationValidate("매봉역"));
    }

    @Test
    @DisplayName("양식에 맞춘 이름이지만 아직 없는 역의 추가는 에러가 뜨지 않는다.")
    void test1() throws Exception {
        assertDoesNotThrow(() -> StationValidate.addStationValidate("원투봉역"));
    }


    @Test
    @DisplayName("없는 이름의 역을 지우려고 하니 에러가 발생한다.")
    void test2() throws Exception {
        assertThrows(IllegalArgumentException.class,() -> StationValidate.deleteStationValidate("원투봉역"));
    }

    @Test
    @DisplayName("노선에 추가된 역은 지울수 없다.")
    void test3() throws Exception {
        assertThrows(IllegalArgumentException.class,()-> StationValidate.deleteStationValidate("매봉역"));
    }
}