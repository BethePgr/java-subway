package subway.domain.section.view;

import java.util.Scanner;

public class SectionInputView {

    private static final Scanner scanner = new Scanner(System.in);

    public static String startSectionInput(){
        System.out.println("## 원하는 기능을 선택하세요.");
        return scanner.next();
    }

    public static String addSectionLineName(){
        System.out.println("## 노선을 입력하세요.");
        return scanner.next();
    }

    public static String addSectionStationName(){
        System.out.println("## 역이름을 입력하세요.");
        return scanner.next();
    }

    public static String addSectionStationNameOrder(){
        System.out.println("## 순서를 입력하세요.");
        return scanner.next();
    }
}
