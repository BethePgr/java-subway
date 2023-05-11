package subway.domain.station.view;

import java.util.Scanner;

public class StationInputView {

    private static final Scanner scanner = new Scanner(System.in);

    public static String startStationInput() {
        System.out.println("\n## 원하는 기능을 선택하세요.");
        return scanner.next();
    }

    public static String addStation() {
        System.out.println("\n## 등록할 역 이름을 입력하세요.");
        return scanner.next();
    }

    public static String deleteStation() {
        System.out.println("\n## 삭제할 역 이름을 입력하세요.");
        return scanner.next();
    }

}
