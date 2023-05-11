package subway.domain.line.view;

import java.util.Scanner;

public class LineInputView {

    private static final Scanner scanner = new Scanner(System.in);

    public static String startLineInput(){
        System.out.println("\n## 원하는 기능을 선택하세요.");
        return scanner.next();
    }

    public static String addLine(){
        System.out.println("\n## 등록할 노선 이름을 입력하세요.");
        return scanner.next();
    }

    public static String startStationOfLine(){
        System.out.println("\n## 등록할 노선의 상행 종점역 이름을 입력하세요.");
        return scanner.next();
    }

    public static String endStationOfLine(){
        System.out.println("\n## 등록할 노선의 하행 종점역 이름을 입력하세요.");
        return scanner.next();
    }

    public static String deleteLine(){
        System.out.println("\n## 삭제할 노선 이름을 입력하세요.");
        return scanner.next();
    }
}
