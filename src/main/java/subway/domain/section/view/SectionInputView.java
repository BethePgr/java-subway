package subway.domain.section.view;

import java.util.Scanner;

public class SectionInputView {

    private static final Scanner scanner = new Scanner(System.in);

    public static String startSectionInput() {
        System.out.println("\n## 원하는 기능을 선택하세요.");
        return scanner.next();
    }

    public static String addSectionLineName() {
        System.out.println("\n## 노선을 입력하세요.");
        return scanner.next();
    }

    public static String addSectionStationName() {
        System.out.println("\n## 역이름을 입력하세요.");
        return scanner.next();
    }

    public static String addSectionStationNameOrder() {
        System.out.println("\n## 순서를 입력하세요.");
        return scanner.next();
    }

    public static String deleteSectionLineName() {
        System.out.println("\n## 삭제할 구간의 노선을 입력하세요.");
        return scanner.next();
    }

    public static String deleteSectionStationName() {
        System.out.println("\n## 삭제할 구간의 역을 입력하세요.");
        return scanner.next();
    }
}
