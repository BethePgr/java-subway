package subway.domain.line.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import subway.domain.line.Line;
import subway.domain.line.LineInitialization;
import subway.domain.line.LineValidate;
import subway.domain.station.StationInitialization;

class LineServiceTest {

    @BeforeEach
    void setUp(){
        StationInitialization.setInitialStations();
        LineInitialization.setInitialLines();
    }

    @Test
    @DisplayName("이미 존재하는 호선을 추가하려고하면 에러가 뜬다.")
    void test1() throws Exception {
        assertThrows(IllegalArgumentException.class,() -> LineValidate.addLineValidate("2호선"));
    }

    @Test
    @DisplayName("양식에 맞지 않는 이름의 호선을 추가하려고 할 시 에러가 뜬다.")
    void test2() throws Exception {
        assertThrows(IllegalArgumentException.class, () -> LineValidate.addLineValidate("가나"));
    }

    @Test
    @DisplayName("존재하지 않는 이름의 호선을 제거하려고 하면 에러가 뜬다.")
    void test3() throws Exception {
        assertThrows(IllegalArgumentException.class, () -> LineValidate.isDeletingInputLineExist("9호선"));
    }
}